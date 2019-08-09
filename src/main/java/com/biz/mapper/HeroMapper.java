package com.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.biz.pojo.Hero;

import java.util.List;

/**
 * @author tianshengfei
 * @Date 2019/8/4 11:52
 * @description
 */
public interface HeroMapper extends BaseMapper<Hero> {
    //自己定义的一个方法
    public List<Hero> getAllHero();

}
