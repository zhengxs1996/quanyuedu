package com.quanyd.common.dto;

import lombok.Data;

/**
 * @ClassName BookDto
 * @Description
 * @Author cc
 * @Date 2019/9/22 16:50
 * @Version 1.0
 */
@Data
public class BookDto {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
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

    /**
     * OSS的objectName
     */
    private String objectName;
}
