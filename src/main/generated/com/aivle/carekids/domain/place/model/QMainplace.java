package com.aivle.carekids.domain.place.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMainplace is a Querydsl query type for Mainplace
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMainplace extends EntityPathBase<Mainplace> {

    private static final long serialVersionUID = 631976532L;

    public static final QMainplace mainplace = new QMainplace("mainplace");

    public final NumberPath<Long> mainplaceId = createNumber("mainplaceId", Long.class);

    public final StringPath mainplacetype = createString("mainplacetype");

    public final ListPath<PlaceMainplace, QPlaceMainplace> placeMainplaces = this.<PlaceMainplace, QPlaceMainplace>createList("placeMainplaces", PlaceMainplace.class, QPlaceMainplace.class, PathInits.DIRECT2);

    public QMainplace(String variable) {
        super(Mainplace.class, forVariable(variable));
    }

    public QMainplace(Path<? extends Mainplace> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMainplace(PathMetadata metadata) {
        super(Mainplace.class, metadata);
    }

}

