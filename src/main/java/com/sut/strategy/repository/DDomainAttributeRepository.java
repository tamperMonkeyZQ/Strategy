package com.sut.strategy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.sut.strategy.entity.DDomainAttributeEntity;


public interface DDomainAttributeRepository extends
        JpaRepository<DDomainAttributeEntity, Long>, QuerydslPredicateExecutor<DDomainAttributeEntity>{

}
