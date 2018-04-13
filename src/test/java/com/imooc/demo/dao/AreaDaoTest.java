package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import com.mchange.v2.sql.filter.SynchronizedFilterPreparedStatement;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    @Ignore
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2,areaList.size());
    }

    @Test
    @Ignore
    public void queryAreaById() {
        Area area =areaDao.queryAreaById(1);
        assertEquals("东苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(3);
        int effectedNum = areaDao.insertArea(area);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = new Area();
        area.setAreaName("东西苑");
        area.setAreaId(2);
        area.setPriority(5);
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.updateArea(area);

    }

    @Test

    public void deleteArea() {
        areaDao.deleteArea(2);
    }
}