package com.sut.strategy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsActivityRecord is a Querydsl query type for TsActivityRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsActivityRecord extends EntityPathBase<TsActivityRecord> {

    private static final long serialVersionUID = 672156248L;

    public static final QTsActivityRecord tsActivityRecord = new QTsActivityRecord("tsActivityRecord");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> projId = createNumber("projId", Integer.class);

    public final DateTimePath<java.util.Date> publishTime = createDateTime("publishTime", java.util.Date.class);

    public final StringPath recordContent = createString("recordContent");

    public final StringPath title = createString("title");

    public QTsActivityRecord(String variable) {
        super(TsActivityRecord.class, forVariable(variable));
    }

    public QTsActivityRecord(Path<? extends TsActivityRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsActivityRecord(PathMetadata metadata) {
        super(TsActivityRecord.class, metadata);
    }

}

