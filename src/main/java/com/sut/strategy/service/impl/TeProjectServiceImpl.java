package com.sut.strategy.service.impl;

import com.sut.strategy.entity.TeProjectEntity;
import com.sut.strategy.repository.TeProjectRepository;
import com.sut.strategy.service.TeProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TeProjectServiceImpl implements TeProjectService {
    @Autowired
    TeProjectRepository teProjectRepository;
    @Override
    public Optional<TeProjectEntity> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public Optional<TeProjectEntity> findByUserId(long userId) {
        return Optional.empty();
    }

    @Override
    public List<TeProjectEntity> findAll() {
        return teProjectRepository.findAll();
    }

}
