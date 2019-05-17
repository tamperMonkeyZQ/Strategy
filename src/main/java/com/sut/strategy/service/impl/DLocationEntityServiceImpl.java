package com.sut.strategy.service.impl;

import com.sut.strategy.entity.DDomainIndustryEntity;
import com.sut.strategy.entity.DLocationEntity;
import com.sut.strategy.entity.QDLocationEntity;
import com.sut.strategy.repository.DLocationRepository;
import com.sut.strategy.service.DLocationEntityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class DLocationEntityServiceImpl implements DLocationEntityService {
    @Autowired
    DLocationRepository dLocationRepository;
    @Override
    public List<DLocationEntity> findAll() {
        List<DLocationEntity> list = new ArrayList<>();
        dLocationRepository.findAll().forEach(dLocationEntity -> {
            list.add(dLocationEntity);
        });
        return list;
    }
}
