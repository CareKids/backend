package com.aivle.carekids.domain.user.oauth2.handler;

import com.aivle.carekids.domain.user.general.validation.SignUpValid;
import com.aivle.carekids.domain.user.oauth2.dto.OAuth2UserDetails;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class OAuth2SuccessHandler implements AuthenticationSuccessHandler {

    private final SignUpValid signUpValid;
    private static final String BASE_URL = "http://localhost:8080/api";

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //이미 존재하는 이메일인지 확인.
        OAuth2UserDetails userDetails = (OAuth2UserDetails) authentication.getPrincipal();

        String redirectUrl;
        Map<String, String> valid = signUpValid.emailValidation(userDetails.getUsername());
        if (!valid.isEmpty()) { // 있으면 redirect /
            // TODO - Json Web Token 줘야 함.
            redirectUrl = UriComponentsBuilder.fromHttpUrl(BASE_URL).toUriString();
        } else { // 없으면 get redirect email 및 socialtype 넣어서. (회원가입 페이지로)
            redirectUrl = UriComponentsBuilder.fromHttpUrl(BASE_URL).path("/signup")
                    .queryParam("email", userDetails.getUsername())
                    .queryParam("social-type", userDetails.getSocialType().toString())
                    .build().toUriString();
        }
        response.sendRedirect(redirectUrl);
    }
}
