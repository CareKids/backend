package com.aivle.carekids.domain.playInfo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PlayInfoImg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PlayInfoImg;
}
