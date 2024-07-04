package com.aivle.carekids.domain.hospital.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHospital is a Querydsl query type for Hospital
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHospital extends EntityPathBase<Hospital> {

    private static final long serialVersionUID = 343350309L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHospital hospital = new QHospital("hospital");

    public final com.aivle.carekids.domain.common.models.QOperateTime _super = new com.aivle.carekids.domain.common.models.QOperateTime(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final EnumPath<com.aivle.carekids.domain.common.models.DayOfWeek> dayOfWeek = _super.dayOfWeek;

    public final BooleanPath deleted = createBoolean("deleted");

    //inherited
    public final TimePath<java.time.LocalTime> endTime = _super.endTime;

    public final StringPath hospitalAddress = createString("hospitalAddress");

    public final NumberPath<Long> hospitalId = createNumber("hospitalId", Long.class);

    public final StringPath hospitalName = createString("hospitalName");

    public final StringPath hospitalNewaddress = createString("hospitalNewaddress");

    public final StringPath hospitalphone = createString("hospitalphone");

    public final EnumPath<HospitalType> hospitalType = createEnum("hospitalType", HospitalType.class);

    public final com.aivle.carekids.domain.common.models.QRegion region;

    //inherited
    public final TimePath<java.time.LocalTime> startTime = _super.startTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final NumberPath<java.math.BigDecimal> x = createNumber("x", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> y = createNumber("y", java.math.BigDecimal.class);

    public QHospital(String variable) {
        this(Hospital.class, forVariable(variable), INITS);
    }

    public QHospital(Path<? extends Hospital> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHospital(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHospital(PathMetadata metadata, PathInits inits) {
        this(Hospital.class, metadata, inits);
    }

    public QHospital(Class<? extends Hospital> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.region = inits.isInitialized("region") ? new com.aivle.carekids.domain.common.models.QRegion(forProperty("region")) : null;
    }

}

