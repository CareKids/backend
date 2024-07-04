package com.aivle.carekids.domain.kidspolicy.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKidsPolicy is a Querydsl query type for KidsPolicy
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKidsPolicy extends EntityPathBase<KidsPolicy> {

    private static final long serialVersionUID = 2040988322L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKidsPolicy kidsPolicy = new QKidsPolicy("kidsPolicy");

    public final com.aivle.carekids.domain.common.models.QBaseEntity _super = new com.aivle.carekids.domain.common.models.QBaseEntity(this);

    public final com.aivle.carekids.domain.common.models.QAgeTag ageTag;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final BooleanPath deleted = createBoolean("deleted");

    public final NumberPath<Long> kidsPolicyId = createNumber("kidsPolicyId", Long.class);

    public final ListPath<KIdsPolicyRegion, QKIdsPolicyRegion> kIdsPolicyRegions = this.<KIdsPolicyRegion, QKIdsPolicyRegion>createList("kIdsPolicyRegions", KIdsPolicyRegion.class, QKIdsPolicyRegion.class, PathInits.DIRECT2);

    public final StringPath kidsPolicyText = createString("kidsPolicyText");

    public final StringPath kidsPolicyTitle = createString("kidsPolicyTitle");

    public final StringPath kidsPolicyUrl = createString("kidsPolicyUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final com.aivle.carekids.domain.user.models.QUsers users;

    public QKidsPolicy(String variable) {
        this(KidsPolicy.class, forVariable(variable), INITS);
    }

    public QKidsPolicy(Path<? extends KidsPolicy> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKidsPolicy(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKidsPolicy(PathMetadata metadata, PathInits inits) {
        this(KidsPolicy.class, metadata, inits);
    }

    public QKidsPolicy(Class<? extends KidsPolicy> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ageTag = inits.isInitialized("ageTag") ? new com.aivle.carekids.domain.common.models.QAgeTag(forProperty("ageTag")) : null;
        this.users = inits.isInitialized("users") ? new com.aivle.carekids.domain.user.models.QUsers(forProperty("users"), inits.get("users")) : null;
    }

}

