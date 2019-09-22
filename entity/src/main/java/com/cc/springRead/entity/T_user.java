package com.cc.springRead.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author cc
 * @since 2019-09-20
 */
@Data
public class T_user extends Model<T_user> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String headurl;

    /**
     * vip等级
     */
    private Integer vip;

    /**
     * vip开通时间
     */
    private Date stopTime;

    /**
     * vip结束时间
     */
    private Date endTime;

    /**
     * 钱包的Id
     */
    private Integer gold;

    /**
     * 月票
     */
    private Integer monthlyTicket;
}
