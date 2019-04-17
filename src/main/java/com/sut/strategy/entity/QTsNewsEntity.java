package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsNewsEntity is a Querydsl query type for TsNewsEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsNewsEntity extends EntityPathBase<TsNewsEntity> {

    private static final long serialVersionUID = -1064418642L;

    public static final QTsNewsEntity tsNewsEntity = new QTsNewsEntity("tsNewsEntity");

    public final StringPath attechTitle = createString("attechTitle");

    public final StringPath attechUrl = createString("attechUrl");

    public final StringPath authorId = createString("authorId");

    public final StringPath columnId = createString("columnId");

    public final StringPath context = createString("context");

    public final StringPath isNew = createString("isNew");

    public final NumberPath<Long> newId = createNumber("newId", Long.class);

    public final StringPath pageUrl = createString("pageUrl");

    public final StringPath subject = createString("subject");

    public final DatePath<java.sql.Date> time = createDate("time", java.sql.Date.class);

    public QTsNewsEntity(String variable) {
        super(TsNewsEntity.class, forVariable(variable));
    }

    public QTsNewsEntity(Path<? extends TsNewsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsNewsEntity(PathMetadata metadata) {
        super(TsNewsEntity.class, metadata);
    }

}

