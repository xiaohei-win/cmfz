package com.baizhi;


import com.baizhi.dao.AdminDAO;
import com.baizhi.dao.AlbumDAO;
import com.baizhi.entity.Admin;
import com.baizhi.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmfzTests {

    @Autowired
    AdminDAO adminDAO;

    @Autowired
    AlbumDAO albumDAO;

    @Test
    public void testAdmin() {
        Admin admin = adminDAO.login("admin");
        System.out.println(admin);
    }

    @Test
    public void testAdminAll() {
        List<Album> albums = albumDAO.selectAll();
        for (Album album : albums) {
            System.out.println(album);
        }
    }

}
