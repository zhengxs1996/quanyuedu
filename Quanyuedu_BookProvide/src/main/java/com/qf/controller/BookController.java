package com.qf.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.cc.springRead.entity.T_book;
import com.cc.springRead.entity.T_book_type;
import com.qf.service.BookService;
import com.qf.service.BookTypeService;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class BookController {

    @Autowired(required = false)
    private BookService bookService;

    @Autowired
    private BookTypeService bookTypeService ;


    //查询 条件 分页

    @PostMapping("/web/book/query.do")
    public R query(@RequestBody Map<String, Object> map) {
        //分页
        Page<T_book> page = new Page<T_book>((Integer) map.get("page"), (Integer) map.get("size"));
        //查询对象b
        QueryWrapper<T_book> queryWrapper = new QueryWrapper<>();
        if (map.containsKey("bookName")) {
            //Lambda
            queryWrapper.lambda().like(T_book::getBookName, "%" + map.get("bookName") + "%");
        }
        return RUtil.setOK("OK", bookService.page(page, queryWrapper));
    }

    @PostMapping("/web/book/querytype.do")
    public R queryType(@RequestBody Map<String,Object> map){
        //分页
        Integer page = (Integer) map.get("page");
        Integer limit=(Integer)map.get("size");
        Integer tid = (Integer)map.get("tid");
        List<T_book> allbook = bookTypeService.findAllbook(page, limit, tid);
        return RUtil.setOK("OK", allbook);


    }
}
