package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.TsGroupModulesEntity;


public interface TsGroupModulesRepository extends
        JpaRepository<TsGroupModulesEntity, Long>, QuerydslPredicateExecutor<TsGroupModulesEntity>{

}
