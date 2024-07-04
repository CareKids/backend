package com.aivle.carekids.domain.kidspolicy.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKIdsPolicyRegion is a Querydsl query type for KIdsPolicyRegion
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKIdsPolicyRegion extends EntityPathBase<KIdsPolicyRegion> {

    private static final long serialVersionUID = -53556202L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKIdsPolicyRegion kIdsPolicyRegion = new QKIdsPolicyRegion("kIdsPolicyRegion");

    public final QKidsPolicy kidsPolicy;

    public final QKidsPolicyRegionId kidsPolicyRegionId;

    public final com.aivle.carekids.domain.common.models.QRegion region;

    public QKIdsPolicyRegion(String variable) {
        this(KIdsPolicyRegion.class, forVariable(variable), INITS);
    }

    public QKIdsPolicyRegion(Path<? extends KIdsPolicyRegion> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKIdsPolicyRegion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKIdsPolicyRegion(PathMetadata metadata, PathInits inits) {
        this(KIdsPolicyRegion.class, metadata, inits);
    }

    public QKIdsPolicyRegion(Class<? extends KIdsPolicyRegion> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.kidsPolicy = inits.isInitialized("kidsPolicy") ? new QKidsPolicy(forProperty("kidsPolicy"), inits.get("kidsPolicy")) : null;
        this.kidsPolicyRegionId = inits.isInitialized("kidsPolicyRegionId") ? new QKidsPolicyRegionId(forProperty("kidsPolicyRegionId")) : null;
        this.region = inits.isInitialized("region") ? new com.aivle.carekids.domain.common.models.QRegion(forProperty("region")) : null;
    }

}

