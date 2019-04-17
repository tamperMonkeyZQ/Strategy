package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.TsPicEntity;


public interface TsPicRepository extends
        JpaRepository<TsPicEntity, Long>, QuerydslPredicateExecutor<TsPicEntity>{

}
