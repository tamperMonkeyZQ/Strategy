package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.DDomainIndustryEntity;


public interface DDomainIndustryRepository extends
        JpaRepository<DDomainIndustryEntity, Long>, QuerydslPredicateExecutor<DDomainIndustryEntity>{

}
