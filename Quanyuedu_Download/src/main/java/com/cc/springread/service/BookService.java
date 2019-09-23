package com.cc.springread.service;

import com.cc.springRead.entity.T_book;

/**
 * @ClassName BookService
 * @Description
 * @Author cc
 * @Date 2019/9/21 16:02
 * @Version 1.0
 */
public interface BookService {

    boolean save(T_book entity);

    T_book getById(Integer id);

    boolean updateById(T_book book);
}
