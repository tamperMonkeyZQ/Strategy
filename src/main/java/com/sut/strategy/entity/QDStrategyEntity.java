package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDStrategyEntity is a Querydsl query type for DStrategyEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDStrategyEntity extends EntityPathBase<DStrategyEntity> {

    private static final long serialVersionUID = -2117251615L;

    public static final QDStrategyEntity dStrategyEntity = new QDStrategyEntity("dStrategyEntity");

    public final StringPath stId = createString("stId");

    public final StringPath strategyName = createString("strategyName");

    public QDStrategyEntity(String variable) {
        super(DStrategyEntity.class, forVariable(variable));
    }

    public QDStrategyEntity(Path<? extends DStrategyEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDStrategyEntity(PathMetadata metadata) {
        super(DStrategyEntity.class, metadata);
    }

}

