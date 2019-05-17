package com.sut.strategy.service;

import com.sut.strategy.entity.DDomainIndustryEntity;
import com.sut.strategy.entity.DLocationEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DLocationEntityService {
    List<DLocationEntity> findAll();
}
