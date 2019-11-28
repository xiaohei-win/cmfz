package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Album
 * @Description TODO
 * @Author buxy
 * @Date 2019/10/15 15:22
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album implements Serializable {
    private String id;

    private String title;

    private String cover;

    private Integer count;

    private Double score;

    private String author;

    private String broadcast;

    private String brief;

    private Date createDate;

    private List<Chapter> chapters;


}