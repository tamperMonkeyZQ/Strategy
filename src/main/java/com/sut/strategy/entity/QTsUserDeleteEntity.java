package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsUserDeleteEntity is a Querydsl query type for TsUserDeleteEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsUserDeleteEntity extends EntityPathBase<TsUserDeleteEntity> {

    private static final long serialVersionUID = 1436528881L;

    public static final QTsUserDeleteEntity tsUserDeleteEntity = new QTsUserDeleteEntity("tsUserDeleteEntity");

    public final StringPath department = createString("department");

    public final StringPath email = createString("email");

    public final NumberPath<Long> groupId = createNumber("groupId", Long.class);

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final StringPath realName = createString("realName");

    public final StringPath resourceKey = createString("resourceKey");

    public final NumberPath<Long> type = createNumber("type", Long.class);

    public final StringPath userName = createString("userName");

    public QTsUserDeleteEntity(String variable) {
        super(TsUserDeleteEntity.class, forVariable(variable));
    }

    public QTsUserDeleteEntity(Path<? extends TsUserDeleteEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsUserDeleteEntity(PathMetadata metadata) {
        super(TsUserDeleteEntity.class, metadata);
    }

}

