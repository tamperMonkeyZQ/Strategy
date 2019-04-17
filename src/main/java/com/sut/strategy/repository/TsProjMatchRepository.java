package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.TsProjMatchEntity;


public interface TsProjMatchRepository extends
        JpaRepository<TsProjMatchEntity, Long>, QuerydslPredicateExecutor<TsProjMatchEntity>{

}
