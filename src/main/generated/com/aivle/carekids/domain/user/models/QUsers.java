package com.aivle.carekids.domain.user.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsers is a Querydsl query type for Users
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsers extends EntityPathBase<Users> {

    private static final long serialVersionUID = 452977305L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUsers users = new QUsers("users");

    public final com.aivle.carekids.domain.common.models.QBaseCreatedAt _super = new com.aivle.carekids.domain.common.models.QBaseCreatedAt(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final BooleanPath deleted = createBoolean("deleted");

    public final ListPath<Kids, QKids> kids = this.<Kids, QKids>createList("kids", Kids.class, QKids.class, PathInits.DIRECT2);

    public final ListPath<com.aivle.carekids.domain.kidspolicy.models.KidsPolicy, com.aivle.carekids.domain.kidspolicy.models.QKidsPolicy> kidsPolicys = this.<com.aivle.carekids.domain.kidspolicy.models.KidsPolicy, com.aivle.carekids.domain.kidspolicy.models.QKidsPolicy>createList("kidsPolicys", com.aivle.carekids.domain.kidspolicy.models.KidsPolicy.class, com.aivle.carekids.domain.kidspolicy.models.QKidsPolicy.class, PathInits.DIRECT2);

    public final ListPath<com.aivle.carekids.domain.notice.models.Notice, com.aivle.carekids.domain.notice.models.QNotice> notices = this.<com.aivle.carekids.domain.notice.models.Notice, com.aivle.carekids.domain.notice.models.QNotice>createList("notices", com.aivle.carekids.domain.notice.models.Notice.class, com.aivle.carekids.domain.notice.models.QNotice.class, PathInits.DIRECT2);

    public final ListPath<com.aivle.carekids.domain.playInfo.models.PlayInfo, com.aivle.carekids.domain.playInfo.models.QPlayInfo> playInfoUsers = this.<com.aivle.carekids.domain.playInfo.models.PlayInfo, com.aivle.carekids.domain.playInfo.models.QPlayInfo>createList("playInfoUsers", com.aivle.carekids.domain.playInfo.models.PlayInfo.class, com.aivle.carekids.domain.playInfo.models.QPlayInfo.class, PathInits.DIRECT2);

    public final ListPath<com.aivle.carekids.domain.question.models.Question, com.aivle.carekids.domain.question.models.QQuestion> questionUsers = this.<com.aivle.carekids.domain.question.models.Question, com.aivle.carekids.domain.question.models.QQuestion>createList("questionUsers", com.aivle.carekids.domain.question.models.Question.class, com.aivle.carekids.domain.question.models.QQuestion.class, PathInits.DIRECT2);

    public final com.aivle.carekids.domain.common.models.QRegion region;

    public final StringPath usersEmail = createString("usersEmail");

    public final NumberPath<Long> usersId = createNumber("usersId", Long.class);

    public final StringPath usersNickname = createString("usersNickname");

    public final StringPath usersPassword = createString("usersPassword");

    public final EnumPath<Role> usersRole = createEnum("usersRole", Role.class);

    public final EnumPath<SocialType> usersSocialType = createEnum("usersSocialType", SocialType.class);

    public QUsers(String variable) {
        this(Users.class, forVariable(variable), INITS);
    }

    public QUsers(Path<? extends Users> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUsers(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUsers(PathMetadata metadata, PathInits inits) {
        this(Users.class, metadata, inits);
    }

    public QUsers(Class<? extends Users> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.region = inits.isInitialized("region") ? new com.aivle.carekids.domain.common.models.QRegion(forProperty("region")) : null;
    }

}

