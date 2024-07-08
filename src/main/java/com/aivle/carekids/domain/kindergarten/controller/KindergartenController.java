package com.aivle.carekids.domain.kindergarten.controller;

import com.aivle.carekids.domain.hospital.dto.HospitalListDto;
import com.aivle.carekids.domain.hospital.service.HospitalService;
import com.aivle.carekids.domain.kindergarten.dto.KindergartenListDto;
import com.aivle.carekids.domain.kindergarten.service.KindergartenService;
import com.aivle.carekids.domain.user.general.jwt.constants.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class KindergartenController {


    private final KindergartenService kindergartenService;
    private final JwtUtils jwtUtils;

    @GetMapping("/kindergarten")
    public ResponseEntity<?> displayKindergarten(@CookieValue(name = "AccessToken", required = false) String accessToken,
                                             @CookieValue(name = "RefreshToken", required = false) String refreshToken,
                                             Pageable pageable){
        Map<String, String> verifyMap = jwtUtils.verifyJWTs(accessToken, refreshToken);

        if (verifyMap.get("state") != null) { // 미가입 OR 로그아웃된 사용자인 경우
            return ResponseEntity.ok(kindergartenService.displayKindergartenGuest(pageable));
        }


        Long usersId = JwtUtils.getUsersId(JwtUtils.verifyToken(accessToken));
        KindergartenListDto kindergartenListDto = kindergartenService.displayKindergartenUser(usersId, pageable);

        if (kindergartenListDto != null){
            if (verifyMap.get("access_cookie") != null){ // 토큰 재발급된 사용자의 경우
                return ResponseEntity.ok(Map.of("new_access_token", verifyMap.get("access_cookie"),
                        "data", kindergartenListDto));
            }

            return ResponseEntity.ok(kindergartenListDto);
        }

        return ResponseEntity.badRequest().body(Map.of("message", "잘못된 접근입니다."));
    }
}
