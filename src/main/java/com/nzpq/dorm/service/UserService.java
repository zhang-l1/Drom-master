package com.nzpq.dorm.service;

import com.nzpq.dorm.domain.PageBean;
import com.nzpq.dorm.domain.User;

public interface UserService {

    User login(User user);

    User findUser(Integer id, String oldPassword);

    void updatePassword(Integer id, String password);

    User findByStuCode(Integer stuCode);

}
