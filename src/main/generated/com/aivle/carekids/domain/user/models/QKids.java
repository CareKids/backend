package com.aivle.carekids.domain.user.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKids is a Querydsl query type for Kids
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKids extends EntityPathBase<Kids> {

    private static final long serialVersionUID = -1509716036L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKids kids = new QKids("kids");

    public final com.aivle.carekids.domain.common.models.QAgeTag ageTag;

    public final NumberPath<Long> kidsId = createNumber("kidsId", Long.class);

    public final QUsers users;

    public QKids(String variable) {
        this(Kids.class, forVariable(variable), INITS);
    }

    public QKids(Path<? extends Kids> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKids(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKids(PathMetadata metadata, PathInits inits) {
        this(Kids.class, metadata, inits);
    }

    public QKids(Class<? extends Kids> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ageTag = inits.isInitialized("ageTag") ? new com.aivle.carekids.domain.common.models.QAgeTag(forProperty("ageTag")) : null;
        this.users = inits.isInitialized("users") ? new QUsers(forProperty("users"), inits.get("users")) : null;
    }

}

