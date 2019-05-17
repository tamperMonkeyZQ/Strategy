package com.sut.strategy.service.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sut.strategy.entity.QTeProjectEntity;
import com.sut.strategy.entity.TeProjectEntity;
import com.sut.strategy.repository.TeProjectRepository;
import com.sut.strategy.service.TeProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
public class TeProjectServiceImpl implements TeProjectService {
    @Autowired
    TeProjectRepository teProjectRepository;
    @Autowired
    JPAQueryFactory queryFactory;
    @Override
    public Optional<TeProjectEntity> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public Optional<TeProjectEntity> findByUserId(long userId) {
        return Optional.empty();
    }

    @Override
    public Optional<TeProjectEntity> findByZXH(String ZXH) {
        QTeProjectEntity qTeProjectEntity = QTeProjectEntity.teProjectEntity;
        return teProjectRepository.findOne(qTeProjectEntity.zxh.eq(ZXH));
    }

    @Override
    public Page<TeProjectEntity> findAll(int pageNumber,int pageSize) {
//        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC,"zxh"));
        PageRequest pageRequest = new PageRequest(pageNumber-1,pageSize);
        Page<TeProjectEntity> tCityPage = teProjectRepository.findAll(pageRequest);
        return tCityPage;
    }

    @Override
    @Transactional
    public void updateByExample(TeProjectEntity teProjectEntity) {
        QTeProjectEntity qTeProjectEntity = QTeProjectEntity.teProjectEntity;
        queryFactory.update(qTeProjectEntity)
                .set(qTeProjectEntity.domain,teProjectEntity.getDomain())
                .execute();

    }

    @Override
    @Transactional
    public boolean deleteByZXH(String ZXH) {
        QTeProjectEntity qTeProjectEntity = QTeProjectEntity.teProjectEntity;
        try {
            if(queryFactory.delete(qTeProjectEntity)
                    .where(qTeProjectEntity.zxh.eq(ZXH))
                    .execute()>0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
