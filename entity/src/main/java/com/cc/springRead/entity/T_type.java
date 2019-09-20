package com.cc.springRead.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author cc
 * @since 2019-09-20
 */
@Data
public class T_type extends Model<T_type> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 类型等级
     */
    private Integer level;

    /**
     * 对应父级分类id
     */
    private Integer parentId;
}
