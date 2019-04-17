package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsModuleEntity is a Querydsl query type for TsModuleEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsModuleEntity extends EntityPathBase<TsModuleEntity> {

    private static final long serialVersionUID = 1302552967L;

    public static final QTsModuleEntity tsModuleEntity = new QTsModuleEntity("tsModuleEntity");

    public final StringPath iconurl = createString("iconurl");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath parentid = createString("parentid");

    public final StringPath type = createString("type");

    public final NumberPath<Long> uid = createNumber("uid", Long.class);

    public final StringPath url = createString("url");

    public QTsModuleEntity(String variable) {
        super(TsModuleEntity.class, forVariable(variable));
    }

    public QTsModuleEntity(Path<? extends TsModuleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsModuleEntity(PathMetadata metadata) {
        super(TsModuleEntity.class, metadata);
    }

}

