package com.yadea.controller;

import com.yadea.pojo.Stars;
import com.yadea.service.StarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Description
 * @Author Dongchi
 * @Date 2021.7.14 16:21
 */
@Controller
@RequestMapping("/star")
public class StarsController {

    //调用service层
    @Autowired
    @Qualifier("StarsServiceimpl")
    private StarsService starsService;

    //查询所有球星信息
    @RequestMapping("/allstar")
    public String List(Model model){
        List<Stars> stars = starsService.QueryAllStars();
        model.addAttribute("stars", stars);
        return "allstar";
    }

    //加入球星页面
    @RequestMapping("/toAddStar")
    public  String  AddPage(){
        return "addstar";
    }

    //加入球星事件
    @RequestMapping("/addstar")
    public String  Add(Stars star){
        starsService.AddStar(star);
        return "redirect:/star/allstar";
    }
     //修改球星信息页面
    @RequestMapping("/toupdate")
    public String UpdatePage(String name, Model model){
        Stars stars = starsService.QueryStarByName(name);    //查
        model.addAttribute("Qstar", stars);                //向前段传数据
        return "updatestar";
    }
    //修改球星信息
    @RequestMapping("/updatestar")
    public String update(Stars star){
        starsService.UpdateStar(star);
        return "redirect:/star/allstar";
    }
    // 删除球星信息
    @RequestMapping("/deletestar/{name}")
    public  String delete(@PathVariable("name") String name){
        starsService.DeleteStarByName(name);
        return "redirect:/star/allstar";
    }
}
