package com.zhengxs.collect.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cc.springRead.entity.T_collect;
import com.quanyd.common.vo.R;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: CollectService
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/21  16:21
 */
public interface CollectService extends IService<T_collect> {
    /**
     * 新增收藏
     * @param collect
     * @return
     */
    R saveCollect(T_collect collect);

    /**
     * 获取用户所有收藏
     * @param uid
     * @return
     */
    List<Integer> getAllByUid(Integer uid);

    /**
     * 检查用户对指定书籍的收藏状态
     * @param collect
     * @return
     */
    Boolean check(T_collect collect);
}
