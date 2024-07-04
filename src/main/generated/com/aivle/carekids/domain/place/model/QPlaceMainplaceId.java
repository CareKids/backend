package com.aivle.carekids.domain.place.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlaceMainplaceId is a Querydsl query type for PlaceMainplaceId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPlaceMainplaceId extends BeanPath<PlaceMainplaceId> {

    private static final long serialVersionUID = 501942012L;

    public static final QPlaceMainplaceId placeMainplaceId = new QPlaceMainplaceId("placeMainplaceId");

    public final NumberPath<Long> mainplaceId = createNumber("mainplaceId", Long.class);

    public final NumberPath<Long> placeId = createNumber("placeId", Long.class);

    public QPlaceMainplaceId(String variable) {
        super(PlaceMainplaceId.class, forVariable(variable));
    }

    public QPlaceMainplaceId(Path<? extends PlaceMainplaceId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceMainplaceId(PathMetadata metadata) {
        super(PlaceMainplaceId.class, metadata);
    }

}

