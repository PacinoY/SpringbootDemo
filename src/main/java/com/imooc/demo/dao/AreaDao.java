package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    //列出信息
    List<Area> queryArea();
    //获取信息
    Area queryAreaById(int areaId);
    //插入信息
    int insertArea(Area area);
    //更新信息
    int updateArea(Area area);
    //删除信息
    int deleteArea(int areaId);
}
