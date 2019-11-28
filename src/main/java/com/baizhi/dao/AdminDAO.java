package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserDAO
 * @Description TODO ()
 * @Author buxy
 * @Date 2019/11/28 11:28
 * @Version 1.0
 **/
@Repository
public interface AdminDAO {

    @Select(value = "select id,username,password,salt,nickname from admin")
    List<Admin> selectAll();

    @Select(value = "select id,username,password,salt,nickname from admin where username = #{username}")
    Admin login(String username);


}
