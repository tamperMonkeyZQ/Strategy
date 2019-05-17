package com.sut.strategy.service;

import com.sut.strategy.entity.TsActivityRecord;

import java.util.List;

public interface TsActivityRecordService {
    List<TsActivityRecord> findAll(int projId);
}
