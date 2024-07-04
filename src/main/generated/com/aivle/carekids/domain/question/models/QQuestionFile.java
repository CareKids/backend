package com.aivle.carekids.domain.question.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQuestionFile is a Querydsl query type for QuestionFile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQuestionFile extends EntityPathBase<QuestionFile> {

    private static final long serialVersionUID = 1737651820L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuestionFile questionFile = new QQuestionFile("questionFile");

    public final BooleanPath deleted = createBoolean("deleted");

    public final QQuestion question;

    public final NumberPath<Long> questionFIleId = createNumber("questionFIleId", Long.class);

    public final StringPath questionFilePath = createString("questionFilePath");

    public QQuestionFile(String variable) {
        this(QuestionFile.class, forVariable(variable), INITS);
    }

    public QQuestionFile(Path<? extends QuestionFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuestionFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuestionFile(PathMetadata metadata, PathInits inits) {
        this(QuestionFile.class, metadata, inits);
    }

    public QQuestionFile(Class<? extends QuestionFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.question = inits.isInitialized("question") ? new QQuestion(forProperty("question"), inits.get("question")) : null;
    }

}

