package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsProjectEntity is a Querydsl query type for TsProjectEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsProjectEntity extends EntityPathBase<TsProjectEntity> {

    private static final long serialVersionUID = -1032864956L;

    public static final QTsProjectEntity tsProjectEntity = new QTsProjectEntity("tsProjectEntity");

    public final DatePath<java.sql.Date> beginTime = createDate("beginTime", java.sql.Date.class);

    public final StringPath benchMark = createString("benchMark");

    public final DatePath<java.sql.Date> cancleTime = createDate("cancleTime", java.sql.Date.class);

    public final NumberPath<Long> cancleUserId = createNumber("cancleUserId", Long.class);

    public final StringPath ccpEmail = createString("ccpEmail");

    public final StringPath ccpFax = createString("ccpFax");

    public final StringPath ccpMobile = createString("ccpMobile");

    public final StringPath ccpName = createString("ccpName");

    public final StringPath ccpPosition = createString("ccpPosition");

    public final StringPath ccpTel = createString("ccpTel");

    public final StringPath company = createString("company");

    public final StringPath companySummary = createString("companySummary");

    public final StringPath completion = createString("completion");

    public final StringPath domainAttrId = createString("domainAttrId");

    public final StringPath domainId = createString("domainId");

    public final StringPath domainName = createString("domainName");

    public final DatePath<java.sql.Date> endTime = createDate("endTime", java.sql.Date.class);

    public final StringPath industryId = createString("industryId");

    public final StringPath isCoop = createString("isCoop");

    public final StringPath locationId = createString("locationId");

    public final StringPath projectName = createString("projectName");

    public final StringPath projectRequire = createString("projectRequire");

    public final NumberPath<Long> projId = createNumber("projId", Long.class);

    public final StringPath requireAttrId = createString("requireAttrId");

    public final StringPath state = createString("state");

    public final StringPath strategyId = createString("strategyId");

    public final DatePath<java.sql.Date> submitTime = createDate("submitTime", java.sql.Date.class);

    public final NumberPath<Long> submitUserId = createNumber("submitUserId", Long.class);

    public final StringPath vid = createString("vid");

    public QTsProjectEntity(String variable) {
        super(TsProjectEntity.class, forVariable(variable));
    }

    public QTsProjectEntity(Path<? extends TsProjectEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsProjectEntity(PathMetadata metadata) {
        super(TsProjectEntity.class, metadata);
    }

}

