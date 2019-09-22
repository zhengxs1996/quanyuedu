package com.cc.springRead.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.springRead.entity.T_book;

/**
 * @ClassName BookDao
 * @Description
 * @Author cc
 * @Date 2019/9/21 16:02
 * @Version 1.0
 */
public interface BookDao extends BaseMapper<T_book> {
    @Override
    int insert(T_book entity);
}
