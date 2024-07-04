package com.aivle.carekids.domain.common.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOperateTime is a Querydsl query type for OperateTime
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QOperateTime extends EntityPathBase<OperateTime> {

    private static final long serialVersionUID = 20335522L;

    public static final QOperateTime operateTime = new QOperateTime("operateTime");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<DayOfWeek> dayOfWeek = createEnum("dayOfWeek", DayOfWeek.class);

    public final TimePath<java.time.LocalTime> endTime = createTime("endTime", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> startTime = createTime("startTime", java.time.LocalTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOperateTime(String variable) {
        super(OperateTime.class, forVariable(variable));
    }

    public QOperateTime(Path<? extends OperateTime> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOperateTime(PathMetadata metadata) {
        super(OperateTime.class, metadata);
    }

}

