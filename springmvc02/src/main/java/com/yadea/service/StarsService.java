package com.yadea.service;

import com.yadea.pojo.Stars;


import java.util.List;

/**
 * @Description
 * @Author xxxxx
 * @Date 2021.7.14 14:21
 */
public interface StarsService {

    //增加球星信息
    int AddStar(Stars star);
    //删除球星信息
    int DeleteStarByName(String name);
    //修改球星信息
    int UpdateStar(Stars star);
    //查询球星信息
    Stars QueryStarByName(String name);
    //查询所有球星信息
    List<Stars> QueryAllStars();
}
