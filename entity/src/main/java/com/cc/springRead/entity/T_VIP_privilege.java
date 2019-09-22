package com.cc.springRead.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * <p>
 * VIP特权表
 * </p>
 *
 * @author cc
 * @since 2019-09-20
 */
@Data
@TableName("t_VIP_privilege")
public class T_VIP_privilege extends Model<T_VIP_privilege> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * VIP特权表名称
     */
    private String privilegename;

}
