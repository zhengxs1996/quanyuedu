package com.zhengxs.collect.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.springRead.entity.T_collect;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName: collectDao
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/21  16:15
 */
public interface CollectDao extends BaseMapper<T_collect> {

    @Select("select * from t_collect where uid = #{uid} and bid = #{bid}")
    T_collect checkRepetition(@Param("uid") Integer uid,@Param("bid") Integer bid);

    @Select("select bid from t_collect where uid = #{uid}")
    List<Integer> selectBidByUid(@Param("uid") Integer uid);
}
