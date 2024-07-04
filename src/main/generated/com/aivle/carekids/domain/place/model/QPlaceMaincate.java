package com.aivle.carekids.domain.place.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlaceMaincate is a Querydsl query type for PlaceMaincate
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlaceMaincate extends EntityPathBase<PlaceMaincate> {

    private static final long serialVersionUID = 787796757L;

    public static final QPlaceMaincate placeMaincate = new QPlaceMaincate("placeMaincate");

    public final NumberPath<Long> placeMaincateId = createNumber("placeMaincateId", Long.class);

    public final StringPath placeMaincateName = createString("placeMaincateName");

    public final ListPath<PlaceSubcate, QPlaceSubcate> placeSubcates = this.<PlaceSubcate, QPlaceSubcate>createList("placeSubcates", PlaceSubcate.class, QPlaceSubcate.class, PathInits.DIRECT2);

    public QPlaceMaincate(String variable) {
        super(PlaceMaincate.class, forVariable(variable));
    }

    public QPlaceMaincate(Path<? extends PlaceMaincate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceMaincate(PathMetadata metadata) {
        super(PlaceMaincate.class, metadata);
    }

}

