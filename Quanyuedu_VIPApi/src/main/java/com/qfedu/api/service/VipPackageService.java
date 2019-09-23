package com.qfedu.api.service;

import com.quanyd.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("VipProvider")
public interface VipPackageService {
    /**
     *  查询所有VIP套餐
     */
    @GetMapping("/vip/provider/list.do")
    R list();
}
