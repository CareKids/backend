package com.aivle.carekids.domain.place.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlace is a Querydsl query type for Place
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlace extends EntityPathBase<Place> {

    private static final long serialVersionUID = -1978650771L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlace place = new QPlace("place");

    public final com.aivle.carekids.domain.common.models.QOperateTime _super = new com.aivle.carekids.domain.common.models.QOperateTime(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final EnumPath<com.aivle.carekids.domain.common.models.DayOfWeek> dayOfWeek = _super.dayOfWeek;

    public final BooleanPath deleted = createBoolean("deleted");

    //inherited
    public final TimePath<java.time.LocalTime> endTime = _super.endTime;

    public final BooleanPath parking = createBoolean("parking");

    public final StringPath placeAddress = createString("placeAddress");

    public final ListPath<PlaceCate, QPlaceCate> placeCates = this.<PlaceCate, QPlaceCate>createList("placeCates", PlaceCate.class, QPlaceCate.class, PathInits.DIRECT2);

    public final NumberPath<Long> placeId = createNumber("placeId", Long.class);

    public final StringPath placeImgUrl = createString("placeImgUrl");

    public final ListPath<PlaceKeyword, QPlaceKeyword> placeKeywords = this.<PlaceKeyword, QPlaceKeyword>createList("placeKeywords", PlaceKeyword.class, QPlaceKeyword.class, PathInits.DIRECT2);

    public final ListPath<PlaceMainplace, QPlaceMainplace> placeMainplaces = this.<PlaceMainplace, QPlaceMainplace>createList("placeMainplaces", PlaceMainplace.class, QPlaceMainplace.class, PathInits.DIRECT2);

    public final StringPath placeName = createString("placeName");

    public final StringPath placeNewAddress = createString("placeNewAddress");

    public final StringPath placePhone = createString("placePhone");

    public final com.aivle.carekids.domain.common.models.QRegion region;

    //inherited
    public final TimePath<java.time.LocalTime> startTime = _super.startTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final NumberPath<java.math.BigDecimal> x = createNumber("x", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> y = createNumber("y", java.math.BigDecimal.class);

    public QPlace(String variable) {
        this(Place.class, forVariable(variable), INITS);
    }

    public QPlace(Path<? extends Place> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlace(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlace(PathMetadata metadata, PathInits inits) {
        this(Place.class, metadata, inits);
    }

    public QPlace(Class<? extends Place> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.region = inits.isInitialized("region") ? new com.aivle.carekids.domain.common.models.QRegion(forProperty("region")) : null;
    }

}

