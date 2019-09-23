package com.qfedu.api.wab;

import com.quanyd.common.dto.UserVipDto;
import com.qfedu.api.service.UserService;
import com.quanyd.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
@Api(value = "用户的操作",tags = "用户的操作")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *  根据用户id查询对应用户的信息
     */
    @ApiOperation(value = "根据用户id查询对应用户的信息",notes = "根据用户id查询对应用户的信息")
    @GetMapping("/vip/user/getById.do")
    public R select(@RequestParam Integer id) {
        return userService.select(id);
    }

    /**
     *  根据用户id查询对应用户的信息,并修改用户的vip等级
     */
    @ApiOperation(value = "变更指定id用户的vip等级",notes = "变更指定id用户的vip等级")
    @PostMapping("/vip/user/updateById.do")
    public R updeat(@RequestBody UserVipDto userVipDto) {
        return userService.updeat(userVipDto);
    }
}
