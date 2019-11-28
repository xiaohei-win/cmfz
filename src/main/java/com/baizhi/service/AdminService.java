package com.baizhi.service;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @ClassName AdminService
 * @Description TODO ()
 * @Author buxy
 * @Date 2019/11/28 15:09
 * @Version 1.0
 **/
public interface AdminService {
    /**
     * 方法描述: TODO()
     *
     * @param username
     * @param password
     * @return java.util.Map<java.lang.String, java.lang.Object>
     * @Author buxy
     * @Date 2019/11/28 16:19
     */
    Map<String, Object> login(String username, String password, String code, HttpSession session);
}
