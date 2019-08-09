package com.biz.service;

import com.biz.mapper.HeroMapper;
import com.biz.pojo.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tianshengfei
 * @Date 2019/8/4 12:08
 * @description
 */
@Service
public class HeroServiceImpl implements HeroService {
    @Autowired
    private HeroMapper heroMapper;
    @Override
    public List<Hero> getAllHero() {
        return heroMapper.getAllHero();
    }
}
