package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTeProjectEntity is a Querydsl query type for TeProjectEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTeProjectEntity extends EntityPathBase<TeProjectEntity> {

    private static final long serialVersionUID = 1749988498L;

    public static final QTeProjectEntity teProjectEntity = new QTeProjectEntity("teProjectEntity");

    public final DatePath<java.sql.Date> beginTime = createDate("beginTime", java.sql.Date.class);

    public final StringPath benchMark = createString("benchMark");

    public final StringPath ccpEmail = createString("ccpEmail");

    public final StringPath ccpFax = createString("ccpFax");

    public final StringPath ccpMobile = createString("ccpMobile");

    public final StringPath ccpName = createString("ccpName");

    public final StringPath ccpPosition = createString("ccpPosition");

    public final StringPath ccpTel = createString("ccpTel");

    public final StringPath checkId = createString("checkId");

    public final StringPath checkIdm = createString("checkIdm");

    public final StringPath company = createString("company");

    public final StringPath companySummary = createString("companySummary");

    public final StringPath domain = createString("domain");

    public final StringPath domainAttr = createString("domainAttr");

    public final StringPath domainAttrId = createString("domainAttrId");

    public final StringPath domainId = createString("domainId");

    public final StringPath domainName = createString("domainName");

    public final DatePath<java.sql.Date> endTime = createDate("endTime", java.sql.Date.class);

    public final StringPath fxh = createString("fxh");

    public final StringPath industry = createString("industry");

    public final StringPath industryId = createString("industryId");

    public final StringPath location = createString("location");

    public final StringPath locationId = createString("locationId");

    public final StringPath projectName = createString("projectName");

    public final StringPath projectRequire = createString("projectRequire");

    public final StringPath requireAttr = createString("requireAttr");

    public final StringPath requireAttrId = createString("requireAttrId");

    public final StringPath strategy = createString("strategy");

    public final StringPath strategyId = createString("strategyId");

    public final DatePath<java.sql.Date> submitTime = createDate("submitTime", java.sql.Date.class);

    public final NumberPath<Long> submitUserId = createNumber("submitUserId", Long.class);

    public final StringPath zxh = createString("zxh");

    public QTeProjectEntity(String variable) {
        super(TeProjectEntity.class, forVariable(variable));
    }

    public QTeProjectEntity(Path<? extends TeProjectEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeProjectEntity(PathMetadata metadata) {
        super(TeProjectEntity.class, metadata);
    }

}

