package com.aivle.carekids.domain.playInfo.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlayInfoDomain is a Querydsl query type for PlayInfoDomain
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlayInfoDomain extends EntityPathBase<PlayInfoDomain> {

    private static final long serialVersionUID = 579662828L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlayInfoDomain playInfoDomain = new QPlayInfoDomain("playInfoDomain");

    public final QDevDomain devDomain;

    public final QPlayInfo playInfo;

    public final QPlayInfoDomainId playInfoDomainId;

    public QPlayInfoDomain(String variable) {
        this(PlayInfoDomain.class, forVariable(variable), INITS);
    }

    public QPlayInfoDomain(Path<? extends PlayInfoDomain> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlayInfoDomain(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlayInfoDomain(PathMetadata metadata, PathInits inits) {
        this(PlayInfoDomain.class, metadata, inits);
    }

    public QPlayInfoDomain(Class<? extends PlayInfoDomain> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.devDomain = inits.isInitialized("devDomain") ? new QDevDomain(forProperty("devDomain")) : null;
        this.playInfo = inits.isInitialized("playInfo") ? new QPlayInfo(forProperty("playInfo"), inits.get("playInfo")) : null;
        this.playInfoDomainId = inits.isInitialized("playInfoDomainId") ? new QPlayInfoDomainId(forProperty("playInfoDomainId")) : null;
    }

}

