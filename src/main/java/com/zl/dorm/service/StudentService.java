package com.zl.dorm.service;

import com.zl.dorm.domain.User;

import java.util.List;

public interface StudentService {
    List<User> findAll(Integer uid,Integer roleId);

    void addStudent(User user);

    void updateDisabled(Integer uid, Integer disabled);

    User findOne(String uid);

    void updateStudent(User user);

    void findUser(String stuCode);
}
