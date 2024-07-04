package com.aivle.carekids.domain.common.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAgeTag is a Querydsl query type for AgeTag
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAgeTag extends EntityPathBase<AgeTag> {

    private static final long serialVersionUID = -1868193206L;

    public static final QAgeTag ageTag = new QAgeTag("ageTag");

    public final NumberPath<Long> ageTagId = createNumber("ageTagId", Long.class);

    public final StringPath ageTagName = createString("ageTagName");

    public final ListPath<com.aivle.carekids.domain.user.models.Kids, com.aivle.carekids.domain.user.models.QKids> kids = this.<com.aivle.carekids.domain.user.models.Kids, com.aivle.carekids.domain.user.models.QKids>createList("kids", com.aivle.carekids.domain.user.models.Kids.class, com.aivle.carekids.domain.user.models.QKids.class, PathInits.DIRECT2);

    public final ListPath<com.aivle.carekids.domain.playInfo.models.PlayInfo, com.aivle.carekids.domain.playInfo.models.QPlayInfo> playInfos = this.<com.aivle.carekids.domain.playInfo.models.PlayInfo, com.aivle.carekids.domain.playInfo.models.QPlayInfo>createList("playInfos", com.aivle.carekids.domain.playInfo.models.PlayInfo.class, com.aivle.carekids.domain.playInfo.models.QPlayInfo.class, PathInits.DIRECT2);

    public QAgeTag(String variable) {
        super(AgeTag.class, forVariable(variable));
    }

    public QAgeTag(Path<? extends AgeTag> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAgeTag(PathMetadata metadata) {
        super(AgeTag.class, metadata);
    }

}

