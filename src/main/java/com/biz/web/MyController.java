package com.biz.web;

import com.biz.pojo.Hero;
import com.biz.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        List<Hero> allHero = heroService.getAllHero();
        System.out.println(allHero);
        return "hello";
    }
}
