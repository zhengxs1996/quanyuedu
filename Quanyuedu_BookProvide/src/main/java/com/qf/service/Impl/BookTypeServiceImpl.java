package com.qf.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.springRead.entity.T_book;
import com.cc.springRead.entity.T_book_type;
import com.github.pagehelper.PageHelper;

import com.qf.dao.BookTypeDao;

import com.qf.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookTypeServiceImpl extends ServiceImpl<BookTypeDao, T_book_type> implements BookTypeService {
    @Autowired(required = false)
    private BookTypeDao bookTypeDao;

//    public List<T_book> findAllbook( String bookName) {
//        PageHelper.startPage(page,limit);
//        List<T_book> books = bookDao.findAllbook(bookName);
//    }
//public List<T_book> findAllbook(Integer page, Integer limit, String bookName) {
//        PageHelper.startPage(page,limit);
//        List<T_book> books = bookDao.findAllbook(bookName);
//        return books;

    @Override
    public List<T_book> findAllbook(Integer page, Integer limit,int tid) {
        PageHelper.startPage(page,limit);
        return  bookTypeDao.findAllbook(tid);
    }
}
