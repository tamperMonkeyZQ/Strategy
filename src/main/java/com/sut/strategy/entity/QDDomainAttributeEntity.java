package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDDomainAttributeEntity is a Querydsl query type for DDomainAttributeEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDDomainAttributeEntity extends EntityPathBase<DDomainAttributeEntity> {

    private static final long serialVersionUID = -2127932112L;

    public static final QDDomainAttributeEntity dDomainAttributeEntity = new QDDomainAttributeEntity("dDomainAttributeEntity");

    public final StringPath daId = createString("daId");

    public final StringPath domainAttrName = createString("domainAttrName");

    public QDDomainAttributeEntity(String variable) {
        super(DDomainAttributeEntity.class, forVariable(variable));
    }

    public QDDomainAttributeEntity(Path<? extends DDomainAttributeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDDomainAttributeEntity(PathMetadata metadata) {
        super(DDomainAttributeEntity.class, metadata);
    }

}

