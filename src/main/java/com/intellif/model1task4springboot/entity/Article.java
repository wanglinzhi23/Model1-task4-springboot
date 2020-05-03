package com.intellif.model1task4springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@TableName("t_article")
public class Article {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField("title")
    private String title;
    @TableField("content")
    private String content;
    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @TableField("modified_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifiedTime;
    @TableField("categories")
    private String categories;
    @TableField("tags")
    private String tags;
    @TableField("allow_comment")
    private boolean allowComment;
    @TableField("thumbnail")
    private String thumbnail;
}
