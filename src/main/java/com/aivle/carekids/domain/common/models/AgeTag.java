package com.aivle.carekids.domain.common.models;

import com.aivle.carekids.domain.playInfo.models.PlayInfo;
import com.aivle.carekids.domain.user.models.Kids;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class AgeTag {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ageTagId;

    @Column(length = 20)
    private String ageTagName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ageTag")
    private List<PlayInfo> playInfos = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ageTag")
    private List<Kids> kids = new ArrayList<>();
}
