package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsUserGroupEntity is a Querydsl query type for TsUserGroupEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsUserGroupEntity extends EntityPathBase<TsUserGroupEntity> {

    private static final long serialVersionUID = 21342047L;

    public static final QTsUserGroupEntity tsUserGroupEntity = new QTsUserGroupEntity("tsUserGroupEntity");

    public final StringPath bz = createString("bz");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public QTsUserGroupEntity(String variable) {
        super(TsUserGroupEntity.class, forVariable(variable));
    }

    public QTsUserGroupEntity(Path<? extends TsUserGroupEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsUserGroupEntity(PathMetadata metadata) {
        super(TsUserGroupEntity.class, metadata);
    }

}

