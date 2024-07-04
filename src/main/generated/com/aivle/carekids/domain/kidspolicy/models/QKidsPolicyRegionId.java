package com.aivle.carekids.domain.kidspolicy.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QKidsPolicyRegionId is a Querydsl query type for KidsPolicyRegionId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QKidsPolicyRegionId extends BeanPath<KidsPolicyRegionId> {

    private static final long serialVersionUID = 428337137L;

    public static final QKidsPolicyRegionId kidsPolicyRegionId = new QKidsPolicyRegionId("kidsPolicyRegionId");

    public final NumberPath<Long> kidsPolicyId = createNumber("kidsPolicyId", Long.class);

    public final NumberPath<Long> regionId = createNumber("regionId", Long.class);

    public QKidsPolicyRegionId(String variable) {
        super(KidsPolicyRegionId.class, forVariable(variable));
    }

    public QKidsPolicyRegionId(Path<? extends KidsPolicyRegionId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKidsPolicyRegionId(PathMetadata metadata) {
        super(KidsPolicyRegionId.class, metadata);
    }

}

