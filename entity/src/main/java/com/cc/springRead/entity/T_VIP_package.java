package com.cc.springRead.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * <p>
 * VIP套餐表
 * </p>
 *
 * @author cc
 * @since 2019-09-20
 */
@Data
@TableName("t_VIP_package")
public class T_VIP_package extends Model<T_VIP_package> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "vid", type = IdType.AUTO)
    private Integer vid;

    /**
     * VIP套餐名
     */
    private String pname;

    /**
     * 套餐简介
     */
    private String presentation;

    /**
     * 套餐原始价格
     */
    private Integer originalcost;

    /**
     * 套餐活动价格
     */
    private Integer preferentialprice;

}
