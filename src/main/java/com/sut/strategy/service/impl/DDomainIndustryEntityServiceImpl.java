package com.sut.strategy.service.impl;

import com.sut.strategy.entity.DDomainIndustryEntity;
import com.sut.strategy.entity.QDDomainIndustryEntity;
import com.sut.strategy.repository.DDomainIndustryRepository;
import com.sut.strategy.service.DDomainIndustryEntityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DDomainIndustryEntityServiceImpl implements DDomainIndustryEntityService {
    @Autowired
    DDomainIndustryRepository dDomainIndustryRepository;
    @Override
    public List<DDomainIndustryEntity> findByDomainId(String domainId) {
        QDDomainIndustryEntity qdDomainIndustryEntity = QDDomainIndustryEntity.dDomainIndustryEntity;
        List<DDomainIndustryEntity> result = (List<DDomainIndustryEntity>) dDomainIndustryRepository.findAll(qdDomainIndustryEntity.domainId.eq(domainId));
        return result;
    }
}
