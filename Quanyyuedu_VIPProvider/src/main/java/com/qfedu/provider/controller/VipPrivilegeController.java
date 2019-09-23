package com.qfedu.provider.controller;

import com.qfedu.provider.service.VipPrivilegeService;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName VipPrivilegeController
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
@RestController
public class VipPrivilegeController {

    @Autowired
    private VipPrivilegeService vipPrivilegeService;

    /**
     *  查询所有VIP的特权
     */
    @GetMapping("/vip/privilege/list.do")
    public R list() {
        return RUtil.setOK("查询成功", vipPrivilegeService.list());
    }
}
