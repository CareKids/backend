package com.aivle.carekids.domain.common.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRegion is a Querydsl query type for Region
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRegion extends EntityPathBase<Region> {

    private static final long serialVersionUID = -1383264477L;

    public static final QRegion region = new QRegion("region");

    public final ListPath<com.aivle.carekids.domain.hospital.model.Hospital, com.aivle.carekids.domain.hospital.model.QHospital> hospitals = this.<com.aivle.carekids.domain.hospital.model.Hospital, com.aivle.carekids.domain.hospital.model.QHospital>createList("hospitals", com.aivle.carekids.domain.hospital.model.Hospital.class, com.aivle.carekids.domain.hospital.model.QHospital.class, PathInits.DIRECT2);

    public final ListPath<com.aivle.carekids.domain.place.model.Place, com.aivle.carekids.domain.place.model.QPlace> place = this.<com.aivle.carekids.domain.place.model.Place, com.aivle.carekids.domain.place.model.QPlace>createList("place", com.aivle.carekids.domain.place.model.Place.class, com.aivle.carekids.domain.place.model.QPlace.class, PathInits.DIRECT2);

    public final NumberPath<Long> regionId = createNumber("regionId", Long.class);

    public final StringPath regionName = createString("regionName");

    public final ListPath<com.aivle.carekids.domain.user.models.Users, com.aivle.carekids.domain.user.models.QUsers> users = this.<com.aivle.carekids.domain.user.models.Users, com.aivle.carekids.domain.user.models.QUsers>createList("users", com.aivle.carekids.domain.user.models.Users.class, com.aivle.carekids.domain.user.models.QUsers.class, PathInits.DIRECT2);

    public QRegion(String variable) {
        super(Region.class, forVariable(variable));
    }

    public QRegion(Path<? extends Region> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegion(PathMetadata metadata) {
        super(Region.class, metadata);
    }

}

