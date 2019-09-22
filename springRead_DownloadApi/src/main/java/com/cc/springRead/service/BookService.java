package com.cc.springRead.service;

import com.cc.springRead.entity.T_book;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName BookService
 * @Description
 * @Author cc
 * @Date 2019/9/21 16:50
 * @Version 1.0
 */
@FeignClient("ReadDownload")
public interface BookService {
    // 获取书籍链接
    @GetMapping("/springRead/download/getDownloadUrl.do")
    R<String> getDownloadUrl(@RequestParam("id") Integer id);

    /**
     * 添加书籍
     * 如果书籍存在，返回书籍objectName及书籍信息，如果不存在，添加书籍并返回书籍objectName及书籍信息
     * @param book
     * @return
     */
    @PostMapping("/springRead/addBook.do")
    R addBook(@RequestBody T_book book);

    // 设置实际url
    @PostMapping("/springRead/setBookUrl.do")
    R setBookUrl(@RequestBody T_book book);
}
