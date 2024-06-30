package com.aivle.carekids.domain.hospital.repository;

import com.aivle.carekids.domain.hospital.model.HospitalCateMid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalCateMidRepository extends JpaRepository<HospitalCateMid, Long> {
}