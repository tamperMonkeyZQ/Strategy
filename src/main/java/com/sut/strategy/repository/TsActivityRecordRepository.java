package com.sut.strategy.repository;

import com.sut.strategy.entity.TsActivityRecord;
import com.sut.strategy.entity.TsGgEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface TsActivityRecordRepository extends
        JpaRepository<TsActivityRecord, Long>, QuerydslPredicateExecutor<TsActivityRecord> {
}
