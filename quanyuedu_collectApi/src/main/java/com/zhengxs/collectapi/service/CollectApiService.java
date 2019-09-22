package com.zhengxs.collectapi.service;

import com.cc.springRead.entity.T_collect;
import com.quanyd.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: CollectApi
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/21  19:34
 */
@FeignClient("CollectProvide")
public interface CollectApiService {

    /**
     * 用户收藏新增
     *
     * @param collect
     * @return
     */
    @PostMapping("/collec/add")
    public R add(@RequestBody T_collect collect);

    /**
     * 用户收藏删除
     *
     * @param collect
     * @return
     */
    @DeleteMapping("/collec/remove")
    public R remove(@RequestBody T_collect collect);

    /**
     * 查询用户所有收藏书籍编号信息
     *
     * @param uid 用户编码
     * @return 返回用户收藏的书籍编码信息
     */
    @GetMapping("/collect/select")
    public R select(@RequestParam("uid") Integer uid);

    /**
     * 查询用户是否包括指定书籍的收藏
     *
     * @param collect
     * @return
     */
    @PostMapping("/collect/check")
    public R check(@RequestBody T_collect collect);
}
