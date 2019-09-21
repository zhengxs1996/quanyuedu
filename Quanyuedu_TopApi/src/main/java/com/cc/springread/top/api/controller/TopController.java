package com.cc.springread.top.api.controller;

import com.cc.springread.top.api.service.TopService;
import com.quanyd.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TopController
 * @Description TODO
 * @Author lyj
 * @Date 2019/9/21 14:29
 * @Version 1.0
 */
@RestController
@Api(value = "排行榜管理", tags = "各种排行榜管理")
public class TopController {
    @Autowired
    private TopService topService;

    @ApiOperation(value = "增加浏览次数", notes = "增加浏览次数")
    @PutMapping("/api/top/addLooks.do")
    public R addLooks(Integer bid){
        return topService.addLooks(bid);
    }

    @ApiOperation(value = "获取总排行榜前十的书籍", notes = "获取总排行榜前十的书籍")
    @GetMapping("/api/top/getTotalTop.do")
    public R selectTotalTopBooks(){
        return topService.selectTotalTopBooks();
    }

    @ApiOperation(value = "获取周排行榜前十的书籍", notes = "获取周排行榜前十的书籍")
    @GetMapping("/api/top/getWeekTop.do")
    public R selectWeekTopBooks(){
        return topService.selectWeekTopBooks();
    }

    @ApiOperation(value = "获取月排行榜前十的书籍", notes = "获取月排行榜前十的书籍")
    @GetMapping("/api/top/getMonthTop.do")
    public R selectMonthTopBooks(){
        return topService.selectMonthTopBooks();
    }
}
