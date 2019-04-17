package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.DLocationEntity;


public interface DLocationRepository extends
        JpaRepository<DLocationEntity, Long>, QuerydslPredicateExecutor<DLocationEntity>{

}
