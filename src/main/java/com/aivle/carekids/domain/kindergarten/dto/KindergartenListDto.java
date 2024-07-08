package com.aivle.carekids.domain.kindergarten.dto;

import com.aivle.carekids.domain.common.dto.RegionDto;
import com.aivle.carekids.domain.common.models.DayOfWeek;
import com.aivle.carekids.domain.common.models.Region;
import com.aivle.carekids.domain.kindergarten.model.KindergartenOperateTime;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class KindergartenListDto {

    private Long kindergartenId;

    private String kindergartenName;

    private String kindergartenAddress;

    private String kindergartenNewaddress;

    private String kindergartenPhone;

    private RegionDto kindergartenRegion;

    private DayOfWeek dayOfWeek;

    private LocalTime startTime;

    private LocalTime endTime;

}
