package com.sut.strategy.service.impl;

import com.sut.strategy.entity.TsProjectEntity;
import com.sut.strategy.repository.TsProjectRepository;
import com.sut.strategy.service.TsProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class TsProjectServiceImpl implements TsProjectService {
    @Autowired
    TsProjectRepository tsProjectRepository;
    @Override
    public Optional<TsProjectEntity> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public Optional<TsProjectEntity> findByUserId(long userId) {
        return Optional.empty();
    }

    @Override
    public List<TsProjectEntity> findAll() {
        return tsProjectRepository.findAll();
    }
}
