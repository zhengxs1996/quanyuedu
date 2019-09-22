package com.sjm.quanread.api.service;

import com.quanyd.common.dto.UserDto;
import com.quanyd.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("LoginProvider")
public interface LoginService {
    @PostMapping("/quanread/loginprovider/login.do")
     R login(@RequestBody UserDto userDto);

    @GetMapping("/quanread/loginprovider/logout.do")
     R logOut();
}
