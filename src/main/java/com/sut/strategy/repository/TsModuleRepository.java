package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.TsModuleEntity;


public interface TsModuleRepository extends
        JpaRepository<TsModuleEntity, Long>, QuerydslPredicateExecutor<TsModuleEntity>{

}
