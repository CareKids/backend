package com.aivle.carekids.domain.kidspolicy.models;

import com.aivle.carekids.domain.common.models.Region;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class KIdsPolicyRegion {
    // 육아 정보 및 지역 중계 엔티티

    @EmbeddedId
    private KidsPolicyRegionId kidsPolicyRegionId;

    @MapsId("kidsPolicyId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kids_policy_id")
    private KidsPolicy kidsPolicy;

    @MapsId("regionId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;
}
