package com.qfedu.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.springRead.entity.T_user;
import org.apache.ibatis.annotations.Update;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
public interface UserDao extends BaseMapper<T_user> {

    @Update("update t_user set vip = #{vip}, stopTime = #{stopTime}, endTime = #{endTime} where id = #{id}")
    int updateMonth(T_user user);

    @Update("update t_user set vip = #{vip}, endTime = #{endTime} where id = #{id}")
    int updateMonthEnd(T_user user);

    @Update("update t_user set vip = #{vip}, stopTime = #{stopTime}, endTime = #{endTime} where id = #{id}")
    int updateYear(T_user user);

    @Update("update t_user set vip = #{vip}, endTime = #{endTime} where id = #{id}")
    int updateYearEnd(T_user user);

    @Update("update t_user set vip = #{vip}, stopTime = #{stopTime} where id = #{id}")
    int updateLifelong(T_user user);
}
