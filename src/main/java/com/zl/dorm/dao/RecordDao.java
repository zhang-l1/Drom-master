package com.zl.dorm.dao;

import com.zl.dorm.domain.Record;
import com.zl.dorm.domain.User;

import java.util.List;

public interface RecordDao {

    List<Record> findAllRecord();

    void deleteDisabled(Integer rid );

    void activeDisabled(Integer rid);

    void addRecord(Record record);

    User findByStucode(Integer stuCode);

    Record findById(Integer rid);

    void updateRecord(Record record);
}
