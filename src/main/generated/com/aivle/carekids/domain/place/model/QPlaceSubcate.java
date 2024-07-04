package com.aivle.carekids.domain.place.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlaceSubcate is a Querydsl query type for PlaceSubcate
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlaceSubcate extends EntityPathBase<PlaceSubcate> {

    private static final long serialVersionUID = -1980973726L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlaceSubcate placeSubcate = new QPlaceSubcate("placeSubcate");

    public final ListPath<PlaceCate, QPlaceCate> placeCates = this.<PlaceCate, QPlaceCate>createList("placeCates", PlaceCate.class, QPlaceCate.class, PathInits.DIRECT2);

    public final QPlaceMaincate placeMaincate;

    public final NumberPath<Long> placeSubcateId = createNumber("placeSubcateId", Long.class);

    public final StringPath placeSubcateName = createString("placeSubcateName");

    public QPlaceSubcate(String variable) {
        this(PlaceSubcate.class, forVariable(variable), INITS);
    }

    public QPlaceSubcate(Path<? extends PlaceSubcate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlaceSubcate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlaceSubcate(PathMetadata metadata, PathInits inits) {
        this(PlaceSubcate.class, metadata, inits);
    }

    public QPlaceSubcate(Class<? extends PlaceSubcate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.placeMaincate = inits.isInitialized("placeMaincate") ? new QPlaceMaincate(forProperty("placeMaincate")) : null;
    }

}

