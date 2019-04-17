package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsProjMatchEntity is a Querydsl query type for TsProjMatchEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsProjMatchEntity extends EntityPathBase<TsProjMatchEntity> {

    private static final long serialVersionUID = -1501907117L;

    public static final QTsProjMatchEntity tsProjMatchEntity = new QTsProjMatchEntity("tsProjMatchEntity");

    public final StringPath cpEmail = createString("cpEmail");

    public final StringPath cpFax = createString("cpFax");

    public final StringPath cpMobile = createString("cpMobile");

    public final StringPath cpPosition = createString("cpPosition");

    public final StringPath cpTel = createString("cpTel");

    public final DatePath<java.sql.Date> matchTime = createDate("matchTime", java.sql.Date.class);

    public final NumberPath<Long> matchUserId = createNumber("matchUserId", Long.class);

    public final StringPath ocpName = createString("ocpName");

    public final StringPath orgId = createString("orgId");

    public final NumberPath<Double> perfReward = createNumber("perfReward", Double.class);

    public final NumberPath<Double> perfScore = createNumber("perfScore", Double.class);

    public final NumberPath<Long> projId = createNumber("projId", Long.class);

    public final StringPath role = createString("role");

    public final NumberPath<Double> roleWeight = createNumber("roleWeight", Double.class);

    public QTsProjMatchEntity(String variable) {
        super(TsProjMatchEntity.class, forVariable(variable));
    }

    public QTsProjMatchEntity(Path<? extends TsProjMatchEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsProjMatchEntity(PathMetadata metadata) {
        super(TsProjMatchEntity.class, metadata);
    }

}

