package com.qfedu.api.service;

import com.quanyd.common.dto.UserVipDto;
import com.quanyd.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("VipProvider")
public interface UserService {
    /**
     *  根据用户id查询对应用户的信息
     */
    @GetMapping("/vip/user/getById.do")
    R select(@RequestParam Integer id);

    /**
     *  根据用户id查询对应用户的信息,并修改用户的vip等级
     */
    @PostMapping("/vip/user/updateById.do")
    public R updeat(@RequestBody UserVipDto userVipDto);
}
