package com.qfedu.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cc.springRead.entity.T_user;
import com.quanyd.common.dto.UserVipDto;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
public interface UserService extends IService<T_user> {
    int update(UserVipDto userVipDto);
}
