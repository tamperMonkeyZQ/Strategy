package com.sut.strategy.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sut.strategy.entity.*;
import com.sut.strategy.repository.TsProjMatchRepository;
import com.sut.strategy.repository.TsProjectRepository;
import com.sut.strategy.repository.TsUserRepository;
import com.sut.strategy.service.ProjectMatchService;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.List;

@Slf4j
@Service
public class ProjectMatchServiceImpl implements ProjectMatchService {
    @Autowired
    JPAQueryFactory queryFactory;
    @Autowired
    TsProjMatchRepository tsProjMatchRepository;
    @Autowired
    TsUserRepository tsUserRepository;
    @Autowired
    TsProjectRepository tsProjectRepository;


    @Override
    public JSONArray findProjectMatchList(String userId) {
        JPAQuery<Tuple> query = queryFactory.select(
                QTsProjectEntity.tsProjectEntity.projectName,
                QTsProjectEntity.tsProjectEntity.beginTime,
                QDOrganizationEntity.dOrganizationEntity.orgName,
                QTsProjectEntity.tsProjectEntity.state,
                QTsProjectEntity.tsProjectEntity.projId)
                .from(QTsProjectEntity.tsProjectEntity, QDOrganizationEntity.dOrganizationEntity, QTsProjMatchEntity.tsProjMatchEntity)
                .where(QTsProjectEntity.tsProjectEntity.projId.eq(QTsProjMatchEntity.tsProjMatchEntity.projId)
                        .and(QDOrganizationEntity.dOrganizationEntity.orgId.eq(QTsProjMatchEntity.tsProjMatchEntity.orgId)));
        if (!userId.equals("1")) {
            query.where(QTsProjMatchEntity.tsProjMatchEntity.matchUserId.eq(Long.parseLong(userId)));
        }
        List<Tuple> list = query.fetch();
        JSONArray result = new JSONArray();
        list.forEach(data ->{
            JSONObject temp = new JSONObject(new LinkedHashMap<>());
            temp.put("projectName", data.get(0, String.class));
            temp.put("beginTime", data.get(1, String.class));
            temp.put("orgName", data.get(2, String.class));
            temp.put("state", Integer.parseInt(data.get(3,String.class)));
            temp.put("id", data.get(4, Integer.class));

            result.add(temp);
        });
        return result;
    }

    @Override
    public JSONObject geiProjectDetail(String id) {
        QTsProjectEntity qtsProjectEntity = QTsProjectEntity.tsProjectEntity;
        QDOrganizationEntity dOrganizationEntity = QDOrganizationEntity.dOrganizationEntity;
        QTsProjMatchEntity qTsProjMatchEntity = QTsProjMatchEntity.tsProjMatchEntity;
        QTsUserEntity qTsUserEntity = QTsUserEntity.tsUserEntity;
        Tuple tuple =
                queryFactory.select(
                        qtsProjectEntity.projectName,
                        qtsProjectEntity.projId,
                        qtsProjectEntity.domainName,
                        QDDomainIndustryEntity.dDomainIndustryEntity.industryName,
                        dOrganizationEntity.orgName,
                        qTsProjMatchEntity.matchTime,
                        qTsUserEntity.userName
                )
                        .from(QTsUserEntity.tsUserEntity, QTsProjectEntity.tsProjectEntity, QDOrganizationEntity.dOrganizationEntity, qTsProjMatchEntity, QTsUserEntity.tsUserEntity, QDDomainIndustryEntity.dDomainIndustryEntity)
                        .where(qTsProjMatchEntity.orgId.eq(dOrganizationEntity.orgId)
                                .and(qTsProjMatchEntity.projId.eq(qtsProjectEntity.projId))
                                .and(QTsUserEntity.tsUserEntity.userId.eq(qTsProjMatchEntity.matchUserId)
                                        .and(QTsUserEntity.tsUserEntity.userId.eq(QTsProjMatchEntity.tsProjMatchEntity.matchUserId))
                                        .and(QTsProjectEntity.tsProjectEntity.projId.eq(Long.parseLong(id))))
                        )
                        .fetch()
                        .get(0);
        System.out.println(tuple.get(QTsProjectEntity.tsProjectEntity.projectName));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("projectName", tuple.get(qtsProjectEntity.projectName));
        jsonObject.put("projId", tuple.get(qtsProjectEntity.projId));
        jsonObject.put("orgName", tuple.get(dOrganizationEntity.orgName));
        jsonObject.put("matchTime", tuple.get(qTsProjMatchEntity.matchTime));
        jsonObject.put("userName", tuple.get(qTsUserEntity.userName));
        jsonObject.put("company", tuple.get(qtsProjectEntity.company));
        jsonObject.put("industryName", tuple.get(QDDomainIndustryEntity.dDomainIndustryEntity.industryName));



        return jsonObject;
    }

    @Override
    public void ProjectMatch(String projId, String userId) {
        TsProjectEntity tsProjectEntity = tsProjectRepository.findOne(QTsProjectEntity.tsProjectEntity.projId.eq(Long.parseLong(projId))).get();
        TsUserEntity tsUserEntity = tsUserRepository.findOne(QTsUserEntity.tsUserEntity.userId.eq(Long.parseLong(userId))).get();
        TsProjMatchEntity tsProjMatchEntity = new TsProjMatchEntity();
        tsProjMatchEntity.setProjId(Long.parseLong(projId));
        tsProjMatchEntity.setMatchUserId(Long.parseLong(userId));
        tsProjMatchEntity.setOrgId(tsUserEntity.getOrgId());
        tsProjMatchEntity.setCpTel(tsUserEntity.getMobile());
        tsProjMatchEntity.setCpMobile(tsUserEntity.getMobile());
        tsProjMatchEntity.setMatchTime(new Date(System.currentTimeMillis()));
        tsProjMatchEntity.setRole("1");
        tsProjMatchEntity.setRoleWeight(1.0);
        tsProjMatchEntity.setOcpName(tsProjectEntity.getCcpName());
        tsProjMatchRepository.save(tsProjMatchEntity);
    }
}
