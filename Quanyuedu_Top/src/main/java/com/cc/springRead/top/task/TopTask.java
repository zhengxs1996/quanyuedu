package com.cc.springRead.top.task;

import com.alibaba.fastjson.JSON;
import com.cc.springRead.top.config.RdisKeyConfig;
import com.cc.springRead.entity.T_book;
import com.cc.springRead.top.cache.JedisUtil;
import com.cc.springRead.top.dao.T_listDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TopTask
 * @Description TODO
 * @Author lyj
 * @Date 2019/9/21 9:34
 * @Version 1.0
 */
@Component
public class TopTask {
    @Autowired
    private T_listDao t_listDao;
    private JedisUtil jedisUtil = JedisUtil.getInstance();

    // 更新总浏览排行榜，每分钟更新一次
    @Scheduled(cron = "0 * * * * ?")
    public void updateTotalTop() {
        System.out.println("更新总榜");
        // 榜单数据库更新
        // 查询数据库Redis
        List<T_book> books = t_listDao.selectTotalTopBooks();
        jedisUtil.del(RdisKeyConfig.TOTAL_LOOKTOP);
        for (int i = 0; i < books.size(); i++) {
            jedisUtil.rpush(RdisKeyConfig.TOTAL_LOOKTOP,  JSON.toJSONString(books.get(i)));
        }

    }

    // 更新月浏览排行榜，每分钟更新一次
    @Scheduled(cron = "0 * * * * ?")
    public void updateMonthTop() {
        System.out.println("更新月榜");
        // 榜单数据库更新
        // 查询数据库Redis
        List<T_book> books = t_listDao.selectMonthTopBooks();
        jedisUtil.del(RdisKeyConfig.MONTH_LOOKTOP);
        for (int i = 0; i < books.size(); i++) {
            jedisUtil.rpush(RdisKeyConfig.MONTH_LOOKTOP,  JSON.toJSONString(books.get(i)));
        }

    }

    // 更新周浏览排行榜，每分钟更新一次
    @Scheduled(cron = "0 * * * * ?")
    public void updateWeekTop() {
        System.out.println("更新周榜");
        // 榜单数据库更新
        // 查询数据库Redis
        List<T_book> books = t_listDao.selectWeekTopBooks();
        jedisUtil.del(RdisKeyConfig.WEEK_LOOKTOP);
        for (int i = 0; i < books.size(); i++) {
            jedisUtil.rpush(RdisKeyConfig.WEEK_LOOKTOP,  JSON.toJSONString(books.get(i)));
        }
    }

    // 每周一凌晨两点清空周榜数据
    @Scheduled(cron = "0 0 2 ? * 2")
    public void clearWeekTop() {
        System.out.println("清空周榜");
        // 榜单数据库更新
        // 查询数据库Redis
        t_listDao.clearWeekLooks();
    }

    // 每月一日凌晨两点更新
    @Scheduled(cron = "0 0 2 1 * ?")
    public void clearMonthTop() {
        System.out.println("清空月榜");
        // 榜单数据库更新
        // 查询数据库Redis
        t_listDao.clearMonthLooks();
    }

}
