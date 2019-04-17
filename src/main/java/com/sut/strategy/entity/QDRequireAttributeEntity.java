package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDRequireAttributeEntity is a Querydsl query type for DRequireAttributeEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDRequireAttributeEntity extends EntityPathBase<DRequireAttributeEntity> {

    private static final long serialVersionUID = 1506531109L;

    public static final QDRequireAttributeEntity dRequireAttributeEntity = new QDRequireAttributeEntity("dRequireAttributeEntity");

    public final StringPath raId = createString("raId");

    public final StringPath requireAttrName = createString("requireAttrName");

    public QDRequireAttributeEntity(String variable) {
        super(DRequireAttributeEntity.class, forVariable(variable));
    }

    public QDRequireAttributeEntity(Path<? extends DRequireAttributeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDRequireAttributeEntity(PathMetadata metadata) {
        super(DRequireAttributeEntity.class, metadata);
    }

}

