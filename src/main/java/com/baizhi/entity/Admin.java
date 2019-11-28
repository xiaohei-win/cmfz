package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Admin
 * @Description TODO ()
 * @Author buxy
 * @Date 2019/11/28 11:24
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    private String id;
    private String username;
    private String password;
    private String salt;
    private String nickname;
}
