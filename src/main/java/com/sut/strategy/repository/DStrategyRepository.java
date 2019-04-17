package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.DStrategyEntity;


public interface DStrategyRepository extends
        JpaRepository<DStrategyEntity, Long>, QuerydslPredicateExecutor<DStrategyEntity>{

}
