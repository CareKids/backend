package com.aivle.carekids.domain.kindergarten.repository;

import com.aivle.carekids.domain.common.dto.RegionDto;
import com.aivle.carekids.domain.kindergarten.dto.KindergartenListDto;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface KindergartenRepositoryCustom {

    RegionDto findRandomRegion();

    Page<KindergartenListDto> findKindergartenByFilter(Long regionId, Pageable pageable);
}
