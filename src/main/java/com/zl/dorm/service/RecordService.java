package com.zl.dorm.service;

import com.zl.dorm.domain.Record;
import com.zl.dorm.domain.User;

import java.util.List;

public interface RecordService {
    List<Record> findAll();

    void updateDisabled(Integer rid, Integer disbled);

    void addRecord(Record record);

    User findOne(Integer stuCode);

    Record findRecord(Integer rid);

    void updateRecord(Record record);
}
