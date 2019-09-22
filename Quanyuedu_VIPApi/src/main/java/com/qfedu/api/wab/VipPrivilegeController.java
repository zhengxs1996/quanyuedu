package com.qfedu.api.wab;

import com.qfedu.api.service.VipPrivilegeService;
import com.quanyd.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName VipPrivilegeController
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
@Api(value = "VIP的特权的操作",tags = "VIP的特权的操作")
@RestController
public class VipPrivilegeController {

    @Autowired
    private VipPrivilegeService vipPrivilegeService;

    /**
     *  查询所有VIP的特权
     */
    @ApiOperation(value = "查询所有VIP的特权",notes = "查询所有VIP的特权")
    @GetMapping("/vip/privilege/list.do")
    public R list() {
        return vipPrivilegeService.list();
    }
}
