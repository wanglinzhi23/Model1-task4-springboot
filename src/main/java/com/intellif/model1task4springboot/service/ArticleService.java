package com.intellif.model1task4springboot.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.intellif.model1task4springboot.entity.Article;


public interface ArticleService {

    IPage<Article> findList(Integer page, Integer pageSize);
}
