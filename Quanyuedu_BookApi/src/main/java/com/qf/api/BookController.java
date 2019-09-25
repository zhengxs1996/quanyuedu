package com.qf.api;

import com.cc.springRead.entity.T_collect;
import com.qf.service.BookApiService;
import com.quanyd.common.vo.R;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Api(value = "查询操作",tags = "查询操作")
@RestController
public class BookController {

    @Autowired(required = false)
    private BookApiService bookApiService;

    @PostMapping("/web/book/query.do")
    public R query(@RequestBody Map<String,Object> map){
       return bookApiService.query(map);

    }

    @ApiOperation(value = "用户搜索书籍类型",notes = "用户搜索书籍类型")
    @PostMapping("/web/book/querytype.do")
    public R queryType(@RequestBody Map<String,Object> map){
        return bookApiService.queryType(map);
    }




}
