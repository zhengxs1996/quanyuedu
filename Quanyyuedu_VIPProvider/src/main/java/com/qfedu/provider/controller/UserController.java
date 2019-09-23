package com.qfedu.provider.controller;


import com.qfedu.provider.service.UserService;
import com.quanyd.common.dto.UserVipDto;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *  根据用户id查询对应用户的信息
     */
    @GetMapping("/vip/user/getById.do")
    public R select(@RequestParam Integer id) {
        return RUtil.setOK("查询成功", userService.getById(id));
    }

    /**
     *  根据用户id查询对应用户的信息,并修改用户的vip等级
     */
    @PostMapping("/vip/user/updateById.do")
    public R updeat(@RequestBody UserVipDto userVipDto) {
        return RUtil.setOK("200",userService.update(userVipDto));
    }
}
