package com.sut.strategy.service.impl;

import com.sut.strategy.entity.QTsUserEntity;
import com.sut.strategy.entity.TsUserEntity;
import com.sut.strategy.repository.TsUserRepository;
import com.sut.strategy.service.TsUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TsUserServiceImpl implements TsUserService {

    @Autowired
    TsUserRepository tsUserRepository;

    @Override
    public Optional<TsUserEntity> findByUsername(String username) {
        QTsUserEntity qTsUserEntity = QTsUserEntity.tsUserEntity;
        Optional<TsUserEntity> optional =
                tsUserRepository.findOne(qTsUserEntity.userName.eq(username));
        return optional;
    }

    @Override
    public Optional<TsUserEntity> findByUserId(long userId) {
        QTsUserEntity qTsUserEntity = QTsUserEntity.tsUserEntity;
        Optional<TsUserEntity> optional =
                tsUserRepository.findOne(qTsUserEntity.userId.eq(userId));
        return optional;
    }

    @Override
    public List<TsUserEntity> findAll() {
        return null;
    }
}
