package com.qfedu.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.springRead.entity.T_user;
import com.quanyd.common.dto.UserVipDto;
import com.qfedu.provider.dao.UserDao;
import com.qfedu.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, T_user> implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

    @Override
    public int update(UserVipDto userVipDto) {
        T_user user1 = userDao.selectById(userVipDto.getId());
        Date stopTime = user1.getStopTime();
        Date endTime = user1.getEndTime();
        if (stopTime == null) {
            /*
             * 获取当前时间系统时间
             */
            Date date = new Date();
            T_user user = new T_user();
            user.setId(userVipDto.getId());
            user.setVip(userVipDto.getVid());
            user.setStopTime(date);
            if (userVipDto.getId() == 1) {
                /*
                 * 以当前的时间为起始时间增加一个月
                 */
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(Calendar.MONTH, 1);
                user.setEndTime(calendar.getTime());
                return userDao.updateMonth(user);
            } else if (userVipDto.getId() == 2) {
                /*
                 * 以当前的时间为起始时间增加一年
                 */
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(Calendar.YEAR, 1);
                user.setEndTime(calendar.getTime());
                return userDao.updateYear(user);
            } else if (userVipDto.getId() == 3) {
                /*
                 * 终身会员只有开始时间没有结束时间
                 */
                return userDao.updateLifelong(user);
            }
        } else if (endTime != null){
            T_user user = new T_user();
            user.setId(userVipDto.getId());
            user.setVip(userVipDto.getVid());
            if (userVipDto.getId() == 1) {
                /*
                 * 以会员到期时间为起始时间增加一个月
                 */
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(endTime);
                calendar.add(Calendar.MONTH, 1);
                user.setEndTime(calendar.getTime());
                int i = userDao.updateMonthEnd(user);
                return i;
            } else if (userVipDto.getId() == 2) {
                /*
                 * 以会员到期时间为起始增加一年
                 */
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(endTime);
                calendar.add(Calendar.YEAR, 1);
                user.setEndTime(calendar.getTime());
                return userDao.updateYearEnd(user);
            }
        }
        return -1;
    }
}
