package com.zl.dorm.service;

import com.zl.dorm.domain.DormBuild;
import com.zl.dorm.domain.User;

import java.util.List;

public interface DormManagerService {
    List<User> findAll();

    Integer addManager(User user);

    void addManagerToBuild(Integer uid, String[] buildId);

    User findManagerByCode(String stuCode);

    User findOne(Integer uid);

    List<DormBuild> findBuildByUid(Integer valueOf);

    void updateManager(User user,String[] dormBuildIds);

    void activeOrDelete(Integer uid, Integer disabled);
}
