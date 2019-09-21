package com.cc.springRead.top.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @ClassName BookDto
 * @Description TODO
 * @Author lyj
 * @Date 2019/9/21 17:54
 * @Version 1.0
 */
@Data
public class BookDto {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 作者id
     */
    private Integer aid;

    /**
     * 封面路径
     */
    private String imgUrl;

    /**
     * 文件路径
     */
    private String textUrl;

    /**
     * 简介
     */
    private String info;

}