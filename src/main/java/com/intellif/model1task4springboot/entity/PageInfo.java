package com.intellif.model1task4springboot.entity;

import lombok.Data;

import java.util.List;

/**
 * 分页返回结果对象
 *
 * @author wanglinzhi
 * @date 2020/5/3
 */
@Data
public class PageInfo<T> {
    private Long total;
    private Integer page;
    private Integer pageSize;
    private Integer pages;
    private List<T> data;
    /**
     * 上一页索引
     */
    private Integer preIndex;
    /**
     * 首页索引
     */
    private Integer firstIndex;
    /**
     * 最后一页索引
     */
    private Integer lastIndex;
    /**
     * 下一页索引
     */
    private Integer nextIndex;
}
