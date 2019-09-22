package com.cc.springRead.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.springRead.dao.BookDao;
import com.cc.springRead.entity.T_book;
import com.cc.springRead.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BookServiceImpl
 * @Description
 * @Author cc
 * @Date 2019/9/21 16:03
 * @Version 1.0
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, T_book> implements BookService {
    @Autowired(required = false)
    private BookDao bookDao;
    @Override
    public boolean save(T_book entity) {
        return bookDao.insert(entity) >= 1;
    }
}
