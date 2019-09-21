package com.cc.springread.top.api.service;

import com.quanyd.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName TopService
 * @Description TODO
 * @Author lyj
 * @Date 2019/9/21 14:29
 * @Version 1.0
 */
@FeignClient("TopApplication")
public interface TopService {
    @PutMapping("/server/top/addLooks.do")
    R addLooks(@RequestParam("bid") Integer bid);

    @GetMapping("/server/top/getTotalTop.do")
    R selectTotalTopBooks();

    @GetMapping("/server/top/getWeekTop.do")
    R selectWeekTopBooks();

    @GetMapping("/server/top/getMonthTop.do")
    R selectMonthTopBooks();
}
