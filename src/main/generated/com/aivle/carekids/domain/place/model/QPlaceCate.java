package com.aivle.carekids.domain.place.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlaceCate is a Querydsl query type for PlaceCate
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlaceCate extends EntityPathBase<PlaceCate> {

    private static final long serialVersionUID = -1635737508L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlaceCate placeCate = new QPlaceCate("placeCate");

    public final QPlace place;

    public final QPlaceCateId placeCateId;

    public final QPlaceSubcate placeSubcate;

    public QPlaceCate(String variable) {
        this(PlaceCate.class, forVariable(variable), INITS);
    }

    public QPlaceCate(Path<? extends PlaceCate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlaceCate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlaceCate(PathMetadata metadata, PathInits inits) {
        this(PlaceCate.class, metadata, inits);
    }

    public QPlaceCate(Class<? extends PlaceCate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new QPlace(forProperty("place"), inits.get("place")) : null;
        this.placeCateId = inits.isInitialized("placeCateId") ? new QPlaceCateId(forProperty("placeCateId")) : null;
        this.placeSubcate = inits.isInitialized("placeSubcate") ? new QPlaceSubcate(forProperty("placeSubcate"), inits.get("placeSubcate")) : null;
    }

}

