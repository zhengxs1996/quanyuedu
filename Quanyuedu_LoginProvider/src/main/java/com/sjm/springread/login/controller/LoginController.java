package com.sjm.springread.login.controller;

import com.quanyd.common.dto.UserDto;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import com.sjm.springread.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: quanyuedu
 * @description:
 * @author: sjm
 * @create: 2019-09-21 20:51
 **/
@RestController
public class LoginController {
    @Autowired(required = false)
    private LoginService loginService;

    @PostMapping("/quanread/loginprovider/login.do")
    public R login(@RequestBody UserDto userDto){
        return loginService.login(userDto);
    }

    @GetMapping("/quanread/loginprovider/logout.do")
    public R logOut(){
        return loginService.logOut();
    }
}
