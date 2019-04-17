package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsGgEntity is a Querydsl query type for TsGgEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsGgEntity extends EntityPathBase<TsGgEntity> {

    private static final long serialVersionUID = 751824123L;

    public static final QTsGgEntity tsGgEntity = new QTsGgEntity("tsGgEntity");

    public final NumberPath<Long> aid = createNumber("aid", Long.class);

    public final DateTimePath<java.sql.Timestamp> gdate = createDateTime("gdate", java.sql.Timestamp.class);

    public final StringPath gGcontent = createString("gGcontent");

    public final StringPath gGtitle = createString("gGtitle");

    public final StringPath ggUrl = createString("ggUrl");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QTsGgEntity(String variable) {
        super(TsGgEntity.class, forVariable(variable));
    }

    public QTsGgEntity(Path<? extends TsGgEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsGgEntity(PathMetadata metadata) {
        super(TsGgEntity.class, metadata);
    }

}

