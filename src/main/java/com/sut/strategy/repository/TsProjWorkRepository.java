package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.TsProjWorkEntity;


public interface TsProjWorkRepository extends
        JpaRepository<TsProjWorkEntity, Long>, QuerydslPredicateExecutor<TsProjWorkEntity>{

}
