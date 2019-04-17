package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.TsProjectEntity;


public interface TsProjectRepository extends
        JpaRepository<TsProjectEntity, Long>, QuerydslPredicateExecutor<TsProjectEntity>{

}
