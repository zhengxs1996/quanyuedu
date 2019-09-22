package com.zhengxs.collect.controller;

import com.cc.springRead.entity.T_collect;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import com.zhengxs.collect.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @ClassName: CollectController
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/21  16:44
 */
@RestController
public class CollectController {

    @Autowired(required = false)
    private CollectService collectService;

    /**
     * 用户收藏新增
     *
     * @param collect
     * @return
     */
    @PostMapping("/collec/add")
    public R add(@RequestBody T_collect collect) {
        return collectService.saveCollect(collect);
    }

    /**
     * 用户收藏删除
     *
     * @param collect
     * @return
     */
    @DeleteMapping("/collec/remove")
    public R remove(@RequestBody T_collect collect) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", collect.getUid());
        map.put("bid", collect.getBid());
        return RUtil.setR(collectService.removeByMap(map), "取消收藏");
    }

    /**
     * 查询用户所有收藏书籍编号信息
     *
     * @param uid 用户编码
     * @return 返回用户收藏的书籍编码信息
     */
    @GetMapping("/collect/select")
    public R select(@RequestParam("uid") Integer uid) {
        return RUtil.setOK("所有收藏", collectService.getAllByUid(uid));
    }

    /**
     * 查询用户是否包括指定书籍的收藏
     *
     * @param collect
     * @return
     */
    @PostMapping("/collect/check")
    public R check(@RequestBody T_collect collect) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", collect.getUid());
        map.put("bid", collect.getBid());
        return RUtil.setR(collectService.check(collect), "收藏状态");
    }

}
