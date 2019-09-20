package com.cc.springRead.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;


/**
 * <p>
 * 书籍类型中间表
 * </p>
 *
 * @author cc
 * @since 2019-09-20
 */
@Data
public class T_book_type extends Model<T_book_type> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 书籍id
     */
    private Integer bid;

    /**
     * 类型id
     */
    private Integer tid;
}
