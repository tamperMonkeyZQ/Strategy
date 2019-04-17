package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDLocationEntity is a Querydsl query type for DLocationEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDLocationEntity extends EntityPathBase<DLocationEntity> {

    private static final long serialVersionUID = -2097442653L;

    public static final QDLocationEntity dLocationEntity = new QDLocationEntity("dLocationEntity");

    public final StringPath area = createString("area");

    public final StringPath code = createString("code");

    public QDLocationEntity(String variable) {
        super(DLocationEntity.class, forVariable(variable));
    }

    public QDLocationEntity(Path<? extends DLocationEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDLocationEntity(PathMetadata metadata) {
        super(DLocationEntity.class, metadata);
    }

}

