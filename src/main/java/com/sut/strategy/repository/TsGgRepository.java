package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.TsGgEntity;


public interface TsGgRepository extends
        JpaRepository<TsGgEntity, Long>, QuerydslPredicateExecutor<TsGgEntity>{

}
