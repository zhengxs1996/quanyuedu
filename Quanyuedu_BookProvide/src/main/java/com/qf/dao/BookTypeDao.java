package com.qf.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.springRead.entity.T_book;
import com.cc.springRead.entity.T_book_type;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookTypeDao extends BaseMapper<T_book_type> {
    //查询所有的信息
    @Select("select * from t_book b inner join t_book_type ty on b.id = ty.bid where ty.tid=#{tid}")
    public List<T_book> findAllbook(int tid);
}
