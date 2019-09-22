package com.zhengxs.collectapi.api;

import com.cc.springRead.entity.T_collect;
import com.quanyd.common.vo.R;
import com.zhengxs.collectapi.service.CollectApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: CollectController
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/21  19:47
 */
@Api(value = "收藏操作",tags = "收藏操作")
@RestController
public class CollectController {

    @Autowired(required = false)
    private CollectApiService collectApiService;

    /**
     * 用户收藏新增
     * @param collect
     * @return
     */
    @ApiOperation(value = "用户添加收藏书籍",notes = "用户收藏新增")
    @PostMapping("/collec/add")
    public R add(@RequestBody T_collect collect) {
        return collectApiService.add(collect);
    }

    /**
     * 用户收藏删除
     *
     * @param collect
     * @return
     */
    @ApiOperation(value = "用户取消收藏书籍",notes = "用户收藏取消")
    @DeleteMapping("/collec/remove")
    public R remove(@RequestBody T_collect collect) {
        return collectApiService.remove(collect);
    }

    /**
     * 查询用户所有收藏书籍编号信息
     * @param uid 用户编码
     * @return 返回用户收藏的书籍编码信息
     */
    @ApiOperation(value = "查询用户所有收藏书籍编码信息",notes = "获得用户所有收藏书籍的编码信息")
    @GetMapping("/collect/select")
    public R select(@RequestParam("uid") Integer uid) {
        return collectApiService.select(uid);
    }

    /**
     * 查询用户是否包括指定书籍的收藏
     *
     * @param collect
     * @return
     */
    @ApiOperation(value = "查询指定书籍用户是否收藏",notes = "查询指定书籍用户是否收藏")
    @PostMapping("/collect/check")
    public R check(@RequestBody T_collect collect) {
        return collectApiService.check(collect);
    }
}
