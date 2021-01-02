package com.zl.dorm.test;

import com.zl.dorm.domain.User;
import com.zl.dorm.service.UserService;
import com.zl.dorm.service.impl.UserServiceImpl;
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
