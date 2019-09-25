package com.qf.service;


import com.baomidou.mybatisplus.extension.service.IService;

import com.cc.springRead.entity.T_book;
import com.cc.springRead.entity.T_book_type;

import java.util.List;

public interface BookTypeService extends IService<T_book_type> {
    //查询所有的信息
    public List<T_book> findAllbook( Integer page, Integer limit,int tid);
}
