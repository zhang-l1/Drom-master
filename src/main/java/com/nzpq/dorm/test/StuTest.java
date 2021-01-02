package com.nzpq.dorm.test;

import com.nzpq.dorm.domain.User;
import com.nzpq.dorm.service.UserService;
import com.nzpq.dorm.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

public class StuTest {

    @Test
    public void findByStuCode(){
        UserService userService = new UserServiceImpl();
        Integer stuCode = 20191028;
        User user = userService.findByStuCode(stuCode);
        System.out.println(user);
    }
}
