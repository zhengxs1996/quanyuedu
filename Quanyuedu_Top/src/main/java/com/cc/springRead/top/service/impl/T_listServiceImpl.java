package com.cc.springRead.top.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.springRead.entity.T_list;
import com.cc.springRead.top.cache.JedisUtil;
import com.cc.springRead.top.dao.T_listDao;
import com.cc.springRead.top.service.T_listService;
import com.cc.springRead.top.util.JSONUtil;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cc.springRead.top.config.RdisKeyConfig;

import java.util.List;

/**
 * <p>
 * 榜单表 服务实现类
 * </p>
 *
 * @author lyj
 * @since 2019-09-21
 */
@Service
public class T_listServiceImpl extends ServiceImpl<T_listDao, T_list> implements T_listService {

    @Autowired(required = false)
    private  T_listDao t_listDao;
    private JedisUtil jedisUtil = JedisUtil.getInstance();

    /**
     * 更新书籍的浏览次数
     * @param bid bookid
     * @return
     */
    @Override
    public R addLooks(int bid) {
        int result = t_listDao.addLooks(bid);
        if (result == 0) {
            return RUtil.setERROR("更新浏览次数失败!");
        } else {
            return RUtil.setOK("OK");
        }
    }

    /**
     * 获取总浏览量排行前十的书籍
     * @return
     */
    @Override
    public R selectTotalTopBooks() {
        List<String> bookList = jedisUtil.lrange(RdisKeyConfig.TOTAL_LOOKTOP, 0, -1);
        return RUtil.setOK("OK", JSONUtil.parseJSONStringList(bookList));
    }

    /**
     * 获取周浏览量排行榜前十的书籍
     * @return
     */
    @Override
    public R selectWeekTopBooks() {
        // 从Redis的List中获取榜单数据，start=0, end=-1代表获取全部
        List<String> bookList = jedisUtil.lrange(RdisKeyConfig.WEEK_LOOKTOP, 0, -1);
        return RUtil.setOK("OK", JSONUtil.parseJSONStringList(bookList));
    }

    /**
     * 获取月浏览量排行榜前十的书籍
     * @return
     */
    @Override
    public R selectMonthTopBooks() {
        List<String> bookList = jedisUtil.lrange(RdisKeyConfig.MONTH_LOOKTOP, 0, -1);
        return RUtil.setOK("OK", JSONUtil.parseJSONStringList(bookList));
    }

    /**
     * 清空月浏览次数
     * @return
     */
    @Override
    public R clearMonthLooks() {
        return RUtil.setOK("OK", t_listDao.clearMonthLooks());
    }

    /**
     * 清空周浏览次数
     * @return
     */
    @Override
    public R clearWeekLooks() {
        return RUtil.setOK("OK", t_listDao.clearWeekLooks());
    }
}
