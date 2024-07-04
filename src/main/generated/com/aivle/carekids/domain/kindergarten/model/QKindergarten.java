package com.aivle.carekids.domain.kindergarten.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKindergarten is a Querydsl query type for Kindergarten
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKindergarten extends EntityPathBase<Kindergarten> {

    private static final long serialVersionUID = 1314529829L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKindergarten kindergarten = new QKindergarten("kindergarten");

    public final com.aivle.carekids.domain.common.models.QOperateTime _super = new com.aivle.carekids.domain.common.models.QOperateTime(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final EnumPath<com.aivle.carekids.domain.common.models.DayOfWeek> dayOfWeek = _super.dayOfWeek;

    public final BooleanPath deleted = createBoolean("deleted");

    //inherited
    public final TimePath<java.time.LocalTime> endTime = _super.endTime;

    public final StringPath kindergartenAddress = createString("kindergartenAddress");

    public final NumberPath<Long> kindergartenId = createNumber("kindergartenId", Long.class);

    public final StringPath kindergartenName = createString("kindergartenName");

    public final StringPath kindergartenNewaddress = createString("kindergartenNewaddress");

    public final StringPath kindergartenPhone = createString("kindergartenPhone");

    public final com.aivle.carekids.domain.common.models.QRegion region;

    //inherited
    public final TimePath<java.time.LocalTime> startTime = _super.startTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final NumberPath<java.math.BigDecimal> x = createNumber("x", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> y = createNumber("y", java.math.BigDecimal.class);

    public QKindergarten(String variable) {
        this(Kindergarten.class, forVariable(variable), INITS);
    }

    public QKindergarten(Path<? extends Kindergarten> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKindergarten(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKindergarten(PathMetadata metadata, PathInits inits) {
        this(Kindergarten.class, metadata, inits);
    }

    public QKindergarten(Class<? extends Kindergarten> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.region = inits.isInitialized("region") ? new com.aivle.carekids.domain.common.models.QRegion(forProperty("region")) : null;
    }

}

