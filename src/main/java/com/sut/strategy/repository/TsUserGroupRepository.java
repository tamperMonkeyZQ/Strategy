package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.TsUserGroupEntity;


public interface TsUserGroupRepository extends
        JpaRepository<TsUserGroupEntity, Long>, QuerydslPredicateExecutor<TsUserGroupEntity>{

}
