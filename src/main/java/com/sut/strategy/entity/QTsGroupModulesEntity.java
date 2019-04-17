package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsGroupModulesEntity is a Querydsl query type for TsGroupModulesEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsGroupModulesEntity extends EntityPathBase<TsGroupModulesEntity> {

    private static final long serialVersionUID = -402788317L;

    public static final QTsGroupModulesEntity tsGroupModulesEntity = new QTsGroupModulesEntity("tsGroupModulesEntity");

    public final StringPath bz = createString("bz");

    public final NumberPath<Long> groupId = createNumber("groupId", Long.class);

    public final StringPath moduleId = createString("moduleId");

    public final NumberPath<Long> moduleUid = createNumber("moduleUid", Long.class);

    public final NumberPath<Long> state = createNumber("state", Long.class);

    public final DateTimePath<java.sql.Timestamp> timeBegin = createDateTime("timeBegin", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> timeEnd = createDateTime("timeEnd", java.sql.Timestamp.class);

    public final NumberPath<Long> uid = createNumber("uid", Long.class);

    public QTsGroupModulesEntity(String variable) {
        super(TsGroupModulesEntity.class, forVariable(variable));
    }

    public QTsGroupModulesEntity(Path<? extends TsGroupModulesEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsGroupModulesEntity(PathMetadata metadata) {
        super(TsGroupModulesEntity.class, metadata);
    }

}

