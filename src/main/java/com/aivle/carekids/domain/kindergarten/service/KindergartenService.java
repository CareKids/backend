package com.aivle.carekids.domain.kindergarten.service;

import com.aivle.carekids.domain.common.dto.RegionDto;
import com.aivle.carekids.domain.hospital.dto.HospitalListDto;
import com.aivle.carekids.domain.hospital.repository.HospitalRepository;
import com.aivle.carekids.domain.kindergarten.dto.KindergartenListDto;
import com.aivle.carekids.domain.kindergarten.repository.KindergartenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;

@Service
@Transactional(readOnly = true) // readonly=true를 붙이는 이유?
@RequiredArgsConstructor // 이 생성자를 쓰는 이유?
public class KindergartenService {

    private final KindergartenRepository kindergartenRepository;

    public KindergartenListDto displayKindergartenGuest(Pageable pageable) {

        RegionDto randomRegion = kindergartenRepository.findRandomRegion();
        Page<KindergartenListDto> kindergartenByRegion = kindergartenRepository.findKindergartenByFilter(randomRegion.getRegionId(), pageable);

        return null;
    }

    public KindergartenListDto displayKindergartenUser(Long usersId, Pageable pageable) {
        return null;
    }
}
