package com.sut.strategy.service.impl;

import com.querydsl.core.types.Expression;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Visitor;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sut.strategy.entity.QTsProjectEntity;
import com.sut.strategy.entity.TsProjectEntity;
import com.sut.strategy.repository.TsProjectRepository;
import com.sut.strategy.service.TsProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Nullable;
import java.util.Optional;
@Slf4j
@Service
public class TsProjectServiceImpl implements TsProjectService {
    @Autowired
    TsProjectRepository tsProjectRepository;
    @Autowired
    JPAQueryFactory queryFactory;
    @Override
    public Optional<TsProjectEntity> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public Optional<TsProjectEntity> findByUserId(long userId) {
        return Optional.empty();
    }

    @Override
    public Page<TsProjectEntity> findAll(String searchText,String domainId,
                                         String industyId,
                                         String domainAttr,
                                         String requireAttr,
                                         String location,
                                         String strategy,int pageNumber, int pageSize) {
        PageRequest pageRequest = new PageRequest(pageNumber-1,pageSize);
        QTsProjectEntity qTsProjectEntity = QTsProjectEntity.tsProjectEntity;
        Predicate predicate = qTsProjectEntity.projId.isNotNull();
        if(searchText!=null)
          predicate = ExpressionUtils.and(predicate,qTsProjectEntity.projectName.like(searchText));
        if(!industyId.equals("0"))
            predicate = ExpressionUtils.and(predicate,qTsProjectEntity.industryId.eq(industyId));
        if(!domainId.equals("0"))
            predicate = ExpressionUtils.and(predicate,qTsProjectEntity.domainId.eq(domainId));
        if(!domainAttr.equals("0"))
            predicate = ExpressionUtils.and(predicate,qTsProjectEntity.domainAttrId.eq(domainAttr));
        if(!requireAttr.equals("0"))
            predicate = ExpressionUtils.and(predicate,qTsProjectEntity.requireAttrId.eq(requireAttr));
        if(!location.equals("0"))
            predicate = ExpressionUtils.and(predicate,qTsProjectEntity.locationId.eq(location));
        if(!strategy.equals("0"))
            predicate = ExpressionUtils.and(predicate,qTsProjectEntity.strategyId.eq(strategy));
        return tsProjectRepository.findAll(predicate,pageRequest);
    }

    @Override
    public Optional<TsProjectEntity> findById(String id) {
        QTsProjectEntity qTsProjectEntity = QTsProjectEntity.tsProjectEntity;
        return tsProjectRepository.findOne(qTsProjectEntity.projId.eq(Long.parseLong(id)));
    }

    @Override
    @Transactional
    public boolean deleteByid(String id) {
        QTsProjectEntity qTsProjectEntity = QTsProjectEntity.tsProjectEntity;
        try {
            if(queryFactory.delete(qTsProjectEntity)
                    .where(qTsProjectEntity.projId.eq(Long.parseLong(id)))
                    .execute()>0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    @Override
    public boolean resetByid(String id) {
        return true;
    }
}
