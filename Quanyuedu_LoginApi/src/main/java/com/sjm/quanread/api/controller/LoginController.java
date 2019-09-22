package com.sjm.quanread.api.controller;

import com.quanyd.common.dto.UserDto;
import com.quanyd.common.vo.R;
import com.sjm.quanread.api.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: quanyuedu
 * @description:
 * @author: sjm
 * @create: 2019-09-22 16:10
 **/
@Api(value = "登录退出操作",tags = "登录退出操作")
@RestController
public class LoginController {
    @Autowired(required = false)
    private LoginService loginService;

    @ApiOperation(value = "登录操作",notes = "实现登录")
    @PostMapping("/quanread/loginprovider/login.do")
    public R login(@RequestBody UserDto userDto){
        return loginService.login(userDto);
    }

    @ApiOperation(value = "退出操作",notes = "实现退出")
    @GetMapping("/quanread/loginprovider/logout.do")
    public R logOut(){
        return loginService.logOut();
    }
}
