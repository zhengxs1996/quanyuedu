package com.cc.springread.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.springRead.entity.T_book;
import com.cc.springread.dao.BookDao;
import com.cc.springread.service.BookService;
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
public class BookServiceImpl  implements BookService {
    @Autowired(required = false)
    private BookDao bookDao;
    @Override
    public boolean save(T_book entity) {
        return bookDao.insert(entity) >= 1;
    }

    @Override
    public T_book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public boolean updateById(T_book book) {
        return bookDao.updateById(book);
    }
}
