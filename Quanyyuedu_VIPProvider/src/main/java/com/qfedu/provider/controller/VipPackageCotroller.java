package com.qfedu.provider.controller;

import com.qfedu.provider.service.VipPackageService;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName VipPackageCotroller
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
@RestController
public class VipPackageCotroller {

    @Autowired
    private VipPackageService vipPackageService;

    /**
     *  查询所有VIP套餐
     */
    @GetMapping("/vip/provider/list.do")
    public R list() {
        return RUtil.setOK("查询成功", vipPackageService.list());
    }
}
