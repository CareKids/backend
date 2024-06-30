package com.aivle.carekids.domain.place.model;

import com.aivle.carekids.domain.common.models.OperateTime;
import com.aivle.carekids.domain.common.models.Region;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@SQLDelete(sql = "UPDATE place SET deleted = true WHERE id=?")
@SQLRestriction("deleted=false")
public class Place extends OperateTime {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long placeId;

    @Column(length = 100, nullable = false)
    private String placeName;

    private String placeImgUrl;

    @Column(length = 100)
    private String placeAddress;

    private String placeNewAddress;

    @Column(length = 15)
    private String placePhone;

    public boolean parking;

    @Column(precision = 10, scale = 6)
    private BigDecimal x;

    @Column(precision = 10, scale = 6)
    private BigDecimal y;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    private boolean deleted = false;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "place")
    private List<PlaceCate> placeCates = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "place")
    private List<PlaceKeyword> placeKeywords = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "place")
    private List<PlaceMainplace> placeMainplaces = new ArrayList<>();
}