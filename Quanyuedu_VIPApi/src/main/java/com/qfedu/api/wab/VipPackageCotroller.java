package com.qfedu.api.wab;

import com.qfedu.api.service.VipPrivilegeService;
import com.quanyd.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName VipPackageCotroller
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
@Api(value = "VIP套餐的操作",tags = "VIP套餐的操作")
@RestController
public class VipPackageCotroller {

    @Autowired
    private VipPrivilegeService vipPrivilegeService;

    /**
     *  查询所有VIP套餐
     */
    @ApiOperation(value = "查询所有VIP套餐",notes = "查询所有VIP套餐")
    @GetMapping("/vip/provider/list.do")
    public R list() {
        return vipPrivilegeService.list();
    }
}
