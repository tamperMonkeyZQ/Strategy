package com.sut.strategy.service;

import com.sut.strategy.entity.DDomainIndustryEntity;

import java.util.List;

public interface DDomainIndustryEntityService {
    List<DDomainIndustryEntity> findByDomainId(String domainId);
}
