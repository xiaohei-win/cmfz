package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Chapter
 * @Description TODO
 * @Author buxy
 * @Date 2019/10/15 15:22
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chapter implements Serializable {
    private String id;

    private String title;

    private String size;

    private String duration;

    private String name;

    private Date createDate;

    private String albumId;
}