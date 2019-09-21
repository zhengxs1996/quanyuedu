package com.cc.springRead.top.web;


import com.cc.springRead.top.service.T_listService;
import com.quanyd.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 榜单表 前端控制器
 * </p>
 *
 * @author lyj
 * @since 2019-09-21
 */
@RestController
@RequestMapping("/server/top")
public class T_listController {
    @Autowired
    private T_listService t_listService;

    @PutMapping("/addLooks.do")
    public R addLooks(@RequestParam("bid") Integer bid){
        return t_listService.addLooks(bid);
    }

    @GetMapping("/getTotalTop.do")
    public R selectTotalTopBooks(){
        return t_listService.selectTotalTopBooks();
    }

    @GetMapping("/getWeekTop.do")
    public R selectWeekTopBooks(){
        return t_listService.selectWeekTopBooks();
    }

    @GetMapping("/getMonthTop.do")
    public R selectMonthTopBooks(){
        return t_listService.selectMonthTopBooks();
    }

}
