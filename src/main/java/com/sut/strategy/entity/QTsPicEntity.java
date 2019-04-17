package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsPicEntity is a Querydsl query type for TsPicEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsPicEntity extends EntityPathBase<TsPicEntity> {

    private static final long serialVersionUID = 1611431157L;

    public static final QTsPicEntity tsPicEntity = new QTsPicEntity("tsPicEntity");

    public final NumberPath<Long> aid = createNumber("aid", Long.class);

    public final DateTimePath<java.sql.Timestamp> date = createDateTime("date", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath picSm = createString("picSm");

    public final StringPath picUrl = createString("picUrl");

    public QTsPicEntity(String variable) {
        super(TsPicEntity.class, forVariable(variable));
    }

    public QTsPicEntity(Path<? extends TsPicEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsPicEntity(PathMetadata metadata) {
        super(TsPicEntity.class, metadata);
    }

}

