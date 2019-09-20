package com.cc.springRead.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;


/**
 * <p>
 * 书籍表
 * </p>
 *
 * @author cc
 * @since 2019-09-20
 */
@Data
@TableName("t_book")
public class T_book extends Model<T_book> {

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
}
