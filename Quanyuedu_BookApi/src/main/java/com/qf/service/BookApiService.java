package com.qf.service;

import com.cc.springRead.entity.T_collect;
import com.quanyd.common.vo.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@FeignClient("BookApplication")

public interface BookApiService {
    @ApiOperation(value = "用户搜索书籍",notes = "用户搜索书籍")
    @PostMapping("/web/book/query.do")
    public R query(@RequestBody Map<String,Object> map);

    @ApiOperation(value = "用户搜索书籍类型",notes = "用户搜索书籍类型")
    @PostMapping("/web/book/querytype.do")
    public R queryType(@RequestBody Map<String,Object> map);


}
