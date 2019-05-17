package com.sut.strategy.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.querydsl.core.Tuple;

import java.util.List;

public interface ProjectMatchService {
    JSONArray findProjectMatchList(String userId);

    JSONObject geiProjectDetail(String id);

    void ProjectMatch(String projId,String userId);
}
