package com.sut.strategy.service;

import com.sut.strategy.entity.TeProjectEntity;
import com.sut.strategy.entity.TsProjectEntity;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface TsProjectService {
    Optional<TsProjectEntity> findByUsername(String username);

    Optional<TsProjectEntity> findByUserId(long userId);

    Page<TsProjectEntity> findAll(String searchText,String domainId,
                                   String industyId,
                                   String domainAttr,
                                   String requireAttr,
                                   String location,
                                   String strategy,int pageNumber, int pageSize);

    Optional<TsProjectEntity> findById(String id);

    boolean deleteByid(String id);

    boolean resetByid(String id);

}
