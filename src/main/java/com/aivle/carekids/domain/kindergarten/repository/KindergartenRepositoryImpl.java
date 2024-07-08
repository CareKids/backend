package com.aivle.carekids.domain.kindergarten.repository;

import com.aivle.carekids.domain.common.dto.QRegionDto;
import com.aivle.carekids.domain.common.dto.RegionDto;
import com.aivle.carekids.domain.kindergarten.dto.KindergartenListDto;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

import static com.aivle.carekids.domain.common.models.QRegion.region;
import static com.aivle.carekids.domain.hospital.model.QHospital.hospital;

@RequiredArgsConstructor
public class KindergartenRepositoryImpl implements KindergartenRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public RegionDto findRandomRegion() {
        return jpaQueryFactory.select(new QRegionDto(region.regionId, region.regionName)).from(hospital)
                .join(hospital.region, region)
                .orderBy(Expressions.numberTemplate(Integer.class, "function('RAND')").asc())
                .limit(1)
                .fetchOne();
    }

    @Override
    public Page<KindergartenListDto> findKindergartenByFilter(Long regionId, Pageable pageable) {
        return null;
    }
}
