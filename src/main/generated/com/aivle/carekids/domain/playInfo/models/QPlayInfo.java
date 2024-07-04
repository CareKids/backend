package com.aivle.carekids.domain.playInfo.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlayInfo is a Querydsl query type for PlayInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlayInfo extends EntityPathBase<PlayInfo> {

    private static final long serialVersionUID = 603527432L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlayInfo playInfo = new QPlayInfo("playInfo");

    public final com.aivle.carekids.domain.common.models.QBaseEntity _super = new com.aivle.carekids.domain.common.models.QBaseEntity(this);

    public final com.aivle.carekids.domain.common.models.QAgeTag ageTag;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final BooleanPath deleted = createBoolean("deleted");

    public final ListPath<PlayInfoDomain, QPlayInfoDomain> playInfoDomains = this.<PlayInfoDomain, QPlayInfoDomain>createList("playInfoDomains", PlayInfoDomain.class, QPlayInfoDomain.class, PathInits.DIRECT2);

    public final NumberPath<Long> PlayInfoId = createNumber("PlayInfoId", Long.class);

    public final StringPath playInfoText = createString("playInfoText");

    public final StringPath playInfoTitle = createString("playInfoTitle");

    public final StringPath playInfoTools = createString("playInfoTools");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final com.aivle.carekids.domain.user.models.QUsers users;

    public QPlayInfo(String variable) {
        this(PlayInfo.class, forVariable(variable), INITS);
    }

    public QPlayInfo(Path<? extends PlayInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlayInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlayInfo(PathMetadata metadata, PathInits inits) {
        this(PlayInfo.class, metadata, inits);
    }

    public QPlayInfo(Class<? extends PlayInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ageTag = inits.isInitialized("ageTag") ? new com.aivle.carekids.domain.common.models.QAgeTag(forProperty("ageTag")) : null;
        this.users = inits.isInitialized("users") ? new com.aivle.carekids.domain.user.models.QUsers(forProperty("users"), inits.get("users")) : null;
    }

}

