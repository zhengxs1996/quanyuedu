package com.qf.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.springRead.entity.T_book;

public interface BookDao extends BaseMapper<T_book> {
    //查询所有的信息
//    @Select("select * from t_book  <where> <if test=\"bookName != null and bookName!= ''\"> and bookName = #{bookName}</if></where>")
//    public List<T_book> findAllbook(@Param("bookName") String bookName);
}
