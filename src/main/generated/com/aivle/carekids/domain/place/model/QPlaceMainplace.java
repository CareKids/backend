package com.aivle.carekids.domain.place.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlaceMainplace is a Querydsl query type for PlaceMainplace
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlaceMainplace extends EntityPathBase<PlaceMainplace> {

    private static final long serialVersionUID = -1335789055L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlaceMainplace placeMainplace = new QPlaceMainplace("placeMainplace");

    public final QMainplace mainplace;

    public final QPlace place;

    public final QPlaceMainplaceId placeMainplaceId;

    public QPlaceMainplace(String variable) {
        this(PlaceMainplace.class, forVariable(variable), INITS);
    }

    public QPlaceMainplace(Path<? extends PlaceMainplace> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlaceMainplace(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlaceMainplace(PathMetadata metadata, PathInits inits) {
        this(PlaceMainplace.class, metadata, inits);
    }

    public QPlaceMainplace(Class<? extends PlaceMainplace> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mainplace = inits.isInitialized("mainplace") ? new QMainplace(forProperty("mainplace")) : null;
        this.place = inits.isInitialized("place") ? new QPlace(forProperty("place"), inits.get("place")) : null;
        this.placeMainplaceId = inits.isInitialized("placeMainplaceId") ? new QPlaceMainplaceId(forProperty("placeMainplaceId")) : null;
    }

}

