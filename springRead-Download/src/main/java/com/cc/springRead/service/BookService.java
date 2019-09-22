package com.cc.springRead.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cc.springRead.entity.T_book;

/**
 * @ClassName BookService
 * @Description
 * @Author cc
 * @Date 2019/9/21 16:02
 * @Version 1.0
 */
public interface BookService extends IService<T_book> {
    @Override
    boolean save(T_book entity);
}
