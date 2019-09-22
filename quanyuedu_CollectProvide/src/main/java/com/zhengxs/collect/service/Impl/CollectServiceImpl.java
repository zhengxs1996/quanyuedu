package com.zhengxs.collect.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.springRead.entity.T_collect;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import com.zhengxs.collect.dao.CollectDao;
import com.zhengxs.collect.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: CollectServiceImpl
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/21  16:21
 */
@Service
public class CollectServiceImpl extends ServiceImpl<CollectDao, T_collect> implements CollectService {

    @Autowired(required = false)
    private CollectDao collectDao;

    @Override
    public R saveCollect(T_collect collect) {
        //判断收藏重复
        if (collectDao.checkRepetition(collect.getUid(), collect.getBid()) != null) {
            //重复收藏
            return RUtil.setERROR("已收藏");
        } else {
            if (collectDao.insert(collect) > 0) {
                return RUtil.setOK("添加收藏");
            } else {
                return RUtil.setERROR("添加失败");
            }
        }
    }

    @Override
    public List<Integer> getAllByUid(Integer uid) {
        return collectDao.selectBidByUid(uid);
    }

    @Override
    public Boolean check(T_collect collect) {
        return collectDao.checkRepetition(collect.getUid(), collect.getBid()) != null;
    }

}
