package com.intellif.model1task4springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.intellif.model1task4springboot.dao.ArticleMapper;
import com.intellif.model1task4springboot.entity.Article;
import com.intellif.model1task4springboot.service.ArticleService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Cacheable(cacheNames = "article")
    public IPage<Article> findList(Integer page, Integer pageSize){
        LambdaQueryWrapper<Article> queryWrapper = new QueryWrapper<Article>().lambda().orderByDesc(Article::getCreateTime);
        IPage<Article> iPages=articleMapper.selectPage(new Page<>(page, pageSize),queryWrapper);
        return iPages;
    }

}
