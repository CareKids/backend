package com.aivle.carekids.domain.place.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlaceKeywordId is a Querydsl query type for PlaceKeywordId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPlaceKeywordId extends BeanPath<PlaceKeywordId> {

    private static final long serialVersionUID = -2062464009L;

    public static final QPlaceKeywordId placeKeywordId = new QPlaceKeywordId("placeKeywordId");

    public final NumberPath<Long> keywordId = createNumber("keywordId", Long.class);

    public final NumberPath<Long> placeId = createNumber("placeId", Long.class);

    public QPlaceKeywordId(String variable) {
        super(PlaceKeywordId.class, forVariable(variable));
    }

    public QPlaceKeywordId(Path<? extends PlaceKeywordId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceKeywordId(PathMetadata metadata) {
        super(PlaceKeywordId.class, metadata);
    }

}

