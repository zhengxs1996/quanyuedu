package com.qf.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.cc.springRead.entity.T_book;
import com.qf.dao.BookDao;
import com.qf.service.BookService;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl extends ServiceImpl<BookDao, T_book> implements BookService {
//    @Autowired(required = false)
//    private BookDao bookDao;

//    public List<T_book> findAllbook(Integer page, Integer limit, String bookName) {
//        PageHelper.startPage(page,limit);
//        List<T_book> books = bookDao.findAllbook(bookName);
//        return books;
//    }
}
