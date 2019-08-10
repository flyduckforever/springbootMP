package com.biz.web;

import com.biz.pojo.Hero;
import com.biz.service.HeroService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianshengfei
 * @Date 2019/8/4 12:06
 * @description
 */
@RestController
public class MyController {
    @Autowired
    private HeroService heroService;
    @RequestMapping("getAllHero")
    public String getAllHero(){
        PageHelper.startPage(2,4);
        List<Hero> allHero = heroService.getAllHero();
        PageInfo pageInfo = new PageInfo(allHero,3);
        List<Hero> list = pageInfo.getList();
        for (Hero o : list) {
            System.out.println(o);
        }
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("总页数: "+pageInfo.getPages());
        System.out.println("导航："+ Arrays.toString(pageInfo.getNavigatepageNums()));
        System.out.println("总数："+pageInfo.getTotal());
        return "hello";
    }
}
