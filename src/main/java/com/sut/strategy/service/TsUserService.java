package com.sut.strategy.service;

import com.sut.strategy.entity.TsUserEntity;

import java.util.List;
import java.util.Optional;

public interface TsUserService {
    Optional<TsUserEntity> findByUsername(String username);

    Optional<TsUserEntity> findByUserId(long userId);

    List<TsUserEntity> findAll();
}
