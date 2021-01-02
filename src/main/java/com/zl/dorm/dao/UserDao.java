package com.zl.dorm.dao;

import com.zl.dorm.domain.User;

public interface UserDao {

    User findByStuCodeAndPassword(String stuCode, String password);

    User findByIdAndPassword(Integer id, String oldPassword);

    void updatePassword(Integer id, String password);

    User findByStuCode(Integer stuCode);
}
