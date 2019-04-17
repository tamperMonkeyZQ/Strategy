package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDOrganizationEntity is a Querydsl query type for DOrganizationEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDOrganizationEntity extends EntityPathBase<DOrganizationEntity> {

    private static final long serialVersionUID = 1746926113L;

    public static final QDOrganizationEntity dOrganizationEntity = new QDOrganizationEntity("dOrganizationEntity");

    public final StringPath bz = createString("bz");

    public final StringPath orgId = createString("orgId");

    public final StringPath orgName = createString("orgName");

    public QDOrganizationEntity(String variable) {
        super(DOrganizationEntity.class, forVariable(variable));
    }

    public QDOrganizationEntity(Path<? extends DOrganizationEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDOrganizationEntity(PathMetadata metadata) {
        super(DOrganizationEntity.class, metadata);
    }

}

