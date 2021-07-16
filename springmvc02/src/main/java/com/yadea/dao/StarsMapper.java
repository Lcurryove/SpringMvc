package com.yadea.dao;

import com.yadea.pojo.Stars;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description
 * @Author xxxxx
 * @Date 2021.7.14 13:26
 */
public interface StarsMapper {

    //增加球星信息
    int AddStar(Stars star);
    //删除球星信息
    int DeleteStarByName(@Param("starname") String name);
    //修改球星信息
    int UpdateStar(Stars stars);
    //查询球星信息
    Stars QueryStarByName(@Param("starname") String name);
    //查询所有球星信息
    List<Stars> QueryAllStars();

}
