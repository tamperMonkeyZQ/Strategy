package com.sut.strategy.service;

import com.sut.strategy.entity.TsProjectEntity;

import java.util.List;
import java.util.Optional;

public interface TsProjectService {
    Optional<TsProjectEntity> findByUsername(String username);

    Optional<TsProjectEntity> findByUserId(long userId);

    List<TsProjectEntity> findAll();
}
