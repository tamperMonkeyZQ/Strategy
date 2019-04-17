package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDDomainIndustryEntity is a Querydsl query type for DDomainIndustryEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDDomainIndustryEntity extends EntityPathBase<DDomainIndustryEntity> {

    private static final long serialVersionUID = 1544535472L;

    public static final QDDomainIndustryEntity dDomainIndustryEntity = new QDDomainIndustryEntity("dDomainIndustryEntity");

    public final StringPath domainId = createString("domainId");

    public final StringPath domainName = createString("domainName");

    public final StringPath industryId = createString("industryId");

    public final StringPath industryName = createString("industryName");

    public QDDomainIndustryEntity(String variable) {
        super(DDomainIndustryEntity.class, forVariable(variable));
    }

    public QDDomainIndustryEntity(Path<? extends DDomainIndustryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDDomainIndustryEntity(PathMetadata metadata) {
        super(DDomainIndustryEntity.class, metadata);
    }

}

