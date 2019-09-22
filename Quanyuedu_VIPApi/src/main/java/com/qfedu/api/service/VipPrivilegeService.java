package com.qfedu.api.service;

import com.quanyd.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("VipProvider")
public interface VipPrivilegeService {
    /**
     *  查询所有VIP的特权
     */
    @GetMapping("/vip/privilege/list.do")
    R list();
}
