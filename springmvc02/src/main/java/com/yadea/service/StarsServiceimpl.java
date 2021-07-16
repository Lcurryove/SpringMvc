package com.yadea.service;

import com.yadea.dao.StarsMapper;
import com.yadea.pojo.Stars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Dongchi
 * @Date 2021.7.14 14:23
 */
@Service
public class StarsServiceimpl implements StarsService{

    // 调用dao层
    @Autowired
    private StarsMapper  starsmapper;

    public void setStarsmapper(StarsMapper starsmapper) {
        this.starsmapper = starsmapper;
    }

    @Override
    public int AddStar(Stars star) {
        return starsmapper.AddStar(star);
    }

    @Override
    public int DeleteStarByName(String name) {
        return starsmapper.DeleteStarByName(name);
    }

    @Override
    public int UpdateStar(Stars star) {
        int a = starsmapper.UpdateStar(star);
        return starsmapper.UpdateStar(star);
    }

    @Override
    public Stars QueryStarByName(String name) {
        return starsmapper.QueryStarByName(name);
    }

    @Override
    public List<Stars> QueryAllStars() {
        return starsmapper.QueryAllStars();
    }
}
