package com.aivle.carekids.domain.playInfo.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDevDomain is a Querydsl query type for DevDomain
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDevDomain extends EntityPathBase<DevDomain> {

    private static final long serialVersionUID = -1890217229L;

    public static final QDevDomain devDomain = new QDevDomain("devDomain");

    public final NumberPath<Long> devDomainId = createNumber("devDomainId", Long.class);

    public final StringPath devDomainType = createString("devDomainType");

    public final ListPath<PlayInfoDomain, QPlayInfoDomain> playInfoDomains = this.<PlayInfoDomain, QPlayInfoDomain>createList("playInfoDomains", PlayInfoDomain.class, QPlayInfoDomain.class, PathInits.DIRECT2);

    public QDevDomain(String variable) {
        super(DevDomain.class, forVariable(variable));
    }

    public QDevDomain(Path<? extends DevDomain> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDevDomain(PathMetadata metadata) {
        super(DevDomain.class, metadata);
    }

}

