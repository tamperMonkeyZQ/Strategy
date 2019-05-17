package com.sut.strategy.service.impl;

import com.sut.strategy.entity.QTsActivityRecord;
import com.sut.strategy.entity.TsActivityRecord;
import com.sut.strategy.repository.TsActivityRecordRepository;
import com.sut.strategy.service.TsActivityRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class TsActivityRecordServiceImpl implements TsActivityRecordService {
    @Autowired
    TsActivityRecordRepository tsActivityRecordRepository;
    @Override
    public List<TsActivityRecord> findAll(int projId) {
        List<TsActivityRecord> list = new ArrayList<>();
        tsActivityRecordRepository.findAll(QTsActivityRecord.tsActivityRecord.projId.eq(projId)).forEach(tsActivityRecord -> {
            list.add(tsActivityRecord);
        });
        return list;
    }
}
