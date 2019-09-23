package com.cc.springread.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.springRead.entity.T_book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @ClassName BookDao
 * @Description
 * @Author cc
 * @Date 2019/9/21 16:02
 * @Version 1.0
 */
public interface BookDao {
    @Insert("insert into t_book (bookName, aid, imgUrl, textUrl, info, objectName) values #{bookName},#{aid},#{imgUrl},#{textUrl},#{info},#{objectName})")
    int insert(T_book entity);

    @Select("select * from t_book where id =#{id}")
    T_book getById(Integer id);

    //@Update("update t_book set bookName=#{bookName}, aid=#{aid}, imgUrl=#{imgUrl}, textUrl=#{textUrl}, info=#{info}, objectName=#{objectName} where id=#{id}")
    boolean updateById(T_book book);
}
