package com.sut.strategy.service;

import com.sut.strategy.entity.TeProjectEntity;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface TeProjectService {
    Optional<TeProjectEntity> findByUsername(String username);

    Optional<TeProjectEntity> findByUserId(long userId);

    Optional<TeProjectEntity> findByZXH(String ZXH);

    Page<TeProjectEntity> findAll(int pageNumber,int pageSize);

    void updateByExample(TeProjectEntity teProjectEntity);

    boolean deleteByZXH(String ZXH);
}
