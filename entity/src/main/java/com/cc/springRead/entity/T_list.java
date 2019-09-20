package com.cc.springRead.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 榜单表
 * </p>
 *
 * @author cc
 * @since 2019-09-20
 */
@Data
public class T_list extends Model<T_list> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 书籍ID
     */
    private Integer bid;

    /**
     * 总浏览量
     */
    private Integer totalLooks;

    /**
     * 月浏览量
     */
    private Integer monthLooks;

    /**
     * 周浏览量
     */
    private Integer weekLooks;
}
