package com.zl.dorm.service.impl;

import com.zl.dorm.dao.UserDao;
import com.zl.dorm.dao.impl.UserDaoImpl;
import com.zl.dorm.domain.User;
import com.zl.dorm.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public User login(User user) {
        User u = userDao.findByStuCodeAndPassword(user.getStuCode(),user.getPassword());
        return u;

    }

    @Override
    public User findUser(Integer id, String oldPassword) {
        return userDao.findByIdAndPassword(id,oldPassword);
    }

    @Override
    public void updatePassword(Integer id, String password) {
        userDao.updatePassword(id,password);
    }

    @Override
    public User findByStuCode(Integer stuCode) {
        return userDao.findByStuCode(stuCode);
    }


}
