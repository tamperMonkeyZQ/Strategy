package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.TsNewsEntity;


public interface TsNewsRepository extends
        JpaRepository<TsNewsEntity, Long>, QuerydslPredicateExecutor<TsNewsEntity>{

}
