package com.cc.springread.controller;

import com.cc.springRead.entity.T_book;

import com.cc.springread.service.BookService;
import com.cc.springread.util.FileUtil;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @ClassName BookController
 * @Description
 * @Author cc
 * @Date 2019/9/21 16:04
 * @Version 1.0
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/shit.do")
    public void shit(Integer id) {
        T_book book = bookService.getById(id);
        System.out.println(book.getBookName());
    }

    // 获取书籍链接
    @GetMapping("/springRead/download/getDownloadUrl.do")
    public R<String> getDownloadUrl(@RequestParam("id") Integer id) {
        return RUtil.setOK("获取下载链接", bookService.getById(id).getTextUrl());
    }

    /**
     * 添加书籍
     * 如果书籍存在，返回书籍objectName及书籍信息，如果不存在，添加书籍并返回书籍objectName及书籍信息
     *
     * @param book
     * @return
     */
    @PostMapping("/springRead/addBook.do")
    public R addBook(@RequestBody T_book book) {
        if (book.getId() != null) {
            T_book book1 = bookService.getById(book.getId());
            if (book1 != null) return RUtil.setOK(book1.getObjectName(), book1);
        }
        book.setObjectName(FileUtil.renameFile(book.getObjectName()));
        bookService.save(book);
        return RUtil.setOK(book.getObjectName(), book);
    }

    private String makeObjectName(String objectName) {
        return UUID.randomUUID().toString() + objectName.substring(objectName.lastIndexOf("."));
    }

    // 设置实际url
    @PostMapping("/springRead/setBookUrl.do")
    public R setBookUrl(@RequestBody T_book book) {
        return RUtil.setR(bookService.updateById(book), book.getTextUrl());
    }
}
