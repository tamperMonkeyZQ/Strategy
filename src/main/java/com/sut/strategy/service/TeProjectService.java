package com.sut.strategy.service;

import com.sut.strategy.entity.TeProjectEntity;

import java.util.List;
import java.util.Optional;

public interface TeProjectService {
    Optional<TeProjectEntity> findByUsername(String username);

    Optional<TeProjectEntity> findByUserId(long userId);

    List<TeProjectEntity> findAll();
}
