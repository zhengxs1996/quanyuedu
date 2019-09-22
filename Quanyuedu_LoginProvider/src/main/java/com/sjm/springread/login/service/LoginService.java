package com.sjm.springread.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cc.springRead.entity.T_user;
import com.quanyd.common.dto.UserDto;
import com.quanyd.common.vo.R;

/**
 * @program: quanyuedu
 * @description:
 * @author: sjm
 * @create: 2019-09-21 20:52
 **/
public interface LoginService extends IService<T_user> {
   R login(UserDto userDto);

   R logOut();
}
