package com.aivle.carekids.domain.playInfo.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlayInfoDomainId is a Querydsl query type for PlayInfoDomainId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPlayInfoDomainId extends BeanPath<PlayInfoDomainId> {

    private static final long serialVersionUID = -1289768409L;

    public static final QPlayInfoDomainId playInfoDomainId = new QPlayInfoDomainId("playInfoDomainId");

    public final NumberPath<Long> devDomainId = createNumber("devDomainId", Long.class);

    public final NumberPath<Long> playInfoId = createNumber("playInfoId", Long.class);

    public QPlayInfoDomainId(String variable) {
        super(PlayInfoDomainId.class, forVariable(variable));
    }

    public QPlayInfoDomainId(Path<? extends PlayInfoDomainId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlayInfoDomainId(PathMetadata metadata) {
        super(PlayInfoDomainId.class, metadata);
    }

}

