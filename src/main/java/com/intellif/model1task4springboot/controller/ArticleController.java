package com.intellif.model1task4springboot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.intellif.model1task4springboot.entity.Article;
import com.intellif.model1task4springboot.entity.PageInfo;
import com.intellif.model1task4springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @GetMapping("login")
    public String login(Model model){
        return "index";
    }

    @GetMapping("/home")
    public String list (Model model ,@RequestParam(value = "index",required = false) Integer page,@RequestParam(value = "length",required = false) Integer pageSize){

        IPage<Article> iPage=articleService.findList(page,pageSize);
        PageInfo<Article> pageInfo = buildPageInfo(iPage,page,pageSize);
        model.addAttribute("articlePageInfo", pageInfo);
        return "index";
    }
    private <T> PageInfo<T> buildPageInfo(IPage<T> dataPage, Integer page,Integer pageSize) {
        PageInfo<T> pageInfo = new PageInfo<>();
        pageInfo.setData(dataPage.getRecords());
        pageInfo.setTotal(dataPage.getTotal());
        pageInfo.setPage(page);
        pageInfo.setPageSize(pageSize);
        pageInfo.setPages((int)dataPage.getPages());
        pageInfo.setFirstIndex(1);
        // 计算上一页索引
        int preIndex = page.equals(1) ? 1 : page - 1;
        // 计算最后一页索引
        int lastIndex = dataPage.getPages() == 1 ? 1 : (int)dataPage.getPages() ;
        // 计算下一页索引
        int nextIndex = page.equals(lastIndex) ? lastIndex : page + 1;
        pageInfo.setPreIndex(preIndex);
        pageInfo.setNextIndex(nextIndex);
        pageInfo.setLastIndex(lastIndex);
        return pageInfo;
    }
}
