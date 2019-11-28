package com.baizhi.dao;

import com.baizhi.entity.Album;

import java.util.List;

/**
 * @ClassName AlbumDAO
 * @Description TODO ()
 * @Author buxy
 * @Date 2019/11/28 12:02
 * @Version 1.0
 **/
public interface AlbumDAO {


    Album selectOneHaveChapters(String albumId);

    List<Album> selectAll();

}
