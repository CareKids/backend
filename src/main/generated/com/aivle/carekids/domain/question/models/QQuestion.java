package com.aivle.carekids.domain.question.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQuestion is a Querydsl query type for Question
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQuestion extends EntityPathBase<Question> {

    private static final long serialVersionUID = 1360524496L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuestion question = new QQuestion("question");

    public final com.aivle.carekids.domain.common.models.QBaseEntity _super = new com.aivle.carekids.domain.common.models.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final BooleanPath deleted = createBoolean("deleted");

    public final BooleanPath questionCheck = createBoolean("questionCheck");

    public final ListPath<QuestionFile, QQuestionFile> questionFiles = this.<QuestionFile, QQuestionFile>createList("questionFiles", QuestionFile.class, QQuestionFile.class, PathInits.DIRECT2);

    public final NumberPath<Long> questionId = createNumber("questionId", Long.class);

    public final StringPath questionText = createString("questionText");

    public final StringPath questionTitle = createString("questionTitle");

    public final BooleanPath secret = createBoolean("secret");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final com.aivle.carekids.domain.user.models.QUsers users;

    public QQuestion(String variable) {
        this(Question.class, forVariable(variable), INITS);
    }

    public QQuestion(Path<? extends Question> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuestion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuestion(PathMetadata metadata, PathInits inits) {
        this(Question.class, metadata, inits);
    }

    public QQuestion(Class<? extends Question> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.users = inits.isInitialized("users") ? new com.aivle.carekids.domain.user.models.QUsers(forProperty("users"), inits.get("users")) : null;
    }

}

