package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsUserEntity is a Querydsl query type for TsUserEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsUserEntity extends EntityPathBase<TsUserEntity> {

    private static final long serialVersionUID = 127076774L;

    public static final QTsUserEntity tsUserEntity = new QTsUserEntity("tsUserEntity");

    public final StringPath email = createString("email");

    public final StringPath fax = createString("fax");

    public final StringPath groupId = createString("groupId");

    public final StringPath locationId = createString("locationId");

    public final StringPath locationName = createString("locationName");

    public final StringPath mobile = createString("mobile");

    public final StringPath organization = createString("organization");

    public final StringPath orgId = createString("orgId");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final StringPath position = createString("position");

    public final StringPath realName = createString("realName");

    public final StringPath resourceKey = createString("resourceKey");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final StringPath userName = createString("userName");

    public QTsUserEntity(String variable) {
        super(TsUserEntity.class, forVariable(variable));
    }

    public QTsUserEntity(Path<? extends TsUserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsUserEntity(PathMetadata metadata) {
        super(TsUserEntity.class, metadata);
    }

}

