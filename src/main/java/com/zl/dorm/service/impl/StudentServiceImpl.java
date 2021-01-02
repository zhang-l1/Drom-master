package com.zl.dorm.service.impl;

import com.zl.dorm.dao.StudentDao;
import com.zl.dorm.dao.impl.StudentDaoImpl;
import com.zl.dorm.domain.User;
import com.zl.dorm.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public List<User> findAll(Integer uid,Integer roleId) {
        return studentDao.findAll(uid,roleId);
    }

    @Override
    public void addStudent(User user) {
        //封装user
        user.setRoleId(2);
        user.setDisabled(0);
        //调用dao
        studentDao.addStudent(user);
    }

    @Override
    public void updateDisabled(Integer uid, Integer disabled) {
        if(disabled == 0){
            //调用删除
            studentDao.delete(uid);
        }
        if(disabled == 1){
            //调用激活
            studentDao.active(uid);
        }
    }

    @Override
    public User findOne(String uid) {
        return studentDao.findByUid(Integer.valueOf(uid));
    }

    @Override
    public void updateStudent(User user) {
        studentDao.updateStudent(user);
    }

    @Override
   public void findUser(String stuCode) { studentDao.findUser(Integer.valueOf(stuCode)); }
}
