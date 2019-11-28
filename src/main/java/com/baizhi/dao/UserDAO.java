package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

/**
 * @ClassName UserDAO
 * @Description TODO ()
 * @Author buxy
 * @Date 2019/11/28 11:28
 * @Version 1.0
 **/
public interface UserDAO {

    List<User> selectAll();

    User selectByPhone(String phone);
}
