package com.intellif.model1task4springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.intellif.model1task4springboot.entity.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
