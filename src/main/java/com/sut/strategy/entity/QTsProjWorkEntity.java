package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsProjWorkEntity is a Querydsl query type for TsProjWorkEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsProjWorkEntity extends EntityPathBase<TsProjWorkEntity> {

    private static final long serialVersionUID = -421741655L;

    public static final QTsProjWorkEntity tsProjWorkEntity = new QTsProjWorkEntity("tsProjWorkEntity");

    public final StringPath orgId = createString("orgId");

    public final StringPath projectName = createString("projectName");

    public final StringPath projFileName = createString("projFileName");

    public final NumberPath<Long> projId = createNumber("projId", Long.class);

    public final StringPath projInstruction = createString("projInstruction");

    public final NumberPath<Long> reportId = createNumber("reportId", Long.class);

    public final DatePath<java.sql.Date> upTime = createDate("upTime", java.sql.Date.class);

    public QTsProjWorkEntity(String variable) {
        super(TsProjWorkEntity.class, forVariable(variable));
    }

    public QTsProjWorkEntity(Path<? extends TsProjWorkEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsProjWorkEntity(PathMetadata metadata) {
        super(TsProjWorkEntity.class, metadata);
    }

}

