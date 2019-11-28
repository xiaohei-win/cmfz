package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description TODO ()
 * @Author buxy
 * @Date 2019/11/28 11:24
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String id;
    private String phone;
    private String username;
    private String password;
    private String salt;
    private String dharma;
    private String province;
    private String city;
    private String sign;
    private String photo;
    private Integer sex;
    private Date createDate;
}
