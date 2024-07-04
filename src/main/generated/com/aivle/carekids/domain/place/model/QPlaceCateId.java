package com.aivle.carekids.domain.place.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlaceCateId is a Querydsl query type for PlaceCateId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPlaceCateId extends BeanPath<PlaceCateId> {

    private static final long serialVersionUID = 14287511L;

    public static final QPlaceCateId placeCateId = new QPlaceCateId("placeCateId");

    public final NumberPath<Long> placeId = createNumber("placeId", Long.class);

    public final NumberPath<Long> placeSubCateId = createNumber("placeSubCateId", Long.class);

    public QPlaceCateId(String variable) {
        super(PlaceCateId.class, forVariable(variable));
    }

    public QPlaceCateId(Path<? extends PlaceCateId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceCateId(PathMetadata metadata) {
        super(PlaceCateId.class, metadata);
    }

}

