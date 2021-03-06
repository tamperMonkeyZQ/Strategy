package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.DRequireAttributeEntity;


public interface DRequireAttributeRepository extends
        JpaRepository<DRequireAttributeEntity, Long>, QuerydslPredicateExecutor<DRequireAttributeEntity>{

}
