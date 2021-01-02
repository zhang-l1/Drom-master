package com.zl.dorm.dao.impl;

import com.zl.dorm.dao.UserDao;
import com.zl.dorm.domain.User;
import com.zl.dorm.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public User findByStuCodeAndPassword(String stuCode, String password) {
        String sql = "select * from tb_user where stu_code = ? and password = ? and disabled = 0";
        User user = null;
        try{
            user = template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),stuCode,password);
            return user;
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public User findByIdAndPassword(Integer id, String oldPassword) {

        User user = null;
        try{
            String sql = "select * from tb_user where id = ? and password = ? ";
            user = template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id,oldPassword);
            return user;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public void updatePassword(Integer id, String password) {
        String sql = "update tb_user set password = ? where id = ?";
        template.update(sql,password,id);
    }

    @Override
    public User findByStuCode(Integer stuCode) {
        String sql = "select * from  tb_user where stu_code = ? ";
        User user = null;
        try{
            user = template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),stuCode);
            return user;
        }catch (Exception e){
            return null;
        }
    }
}
