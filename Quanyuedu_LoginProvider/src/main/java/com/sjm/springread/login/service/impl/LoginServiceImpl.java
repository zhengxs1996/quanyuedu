package com.sjm.springread.login.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.springRead.entity.T_user;
import com.quanyd.common.dto.UserDto;
import com.quanyd.common.utils.RUtil;
import com.quanyd.common.vo.R;
import com.sjm.springread.login.config.SystemConfig;
import com.sjm.springread.login.dao.LoginDao;
import com.sjm.springread.login.service.LoginService;
import com.sjm.springread.login.util.EncryptionUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

/**
 * @program: quanyuedu
 * @description:
 * @author: sjm
 * @create: 2019-09-21 20:52
 **/
@Service
public class LoginServiceImpl extends ServiceImpl<LoginDao,T_user> implements LoginService {

    @Override
    public R login(UserDto userDto) {
//        UsernamePasswordToken token = new UsernamePasswordToken(userDto.getUname(),userDto.getUpass());
//        Subject subject = SecurityUtils.getSubject();
//        try {
//            //进行登录判断
//            subject.login(token);
//            return RUtil.setOK("登录成功");
//        } catch (AuthenticationException e) {
//            e.printStackTrace();
//            RUtil.setERROR("账户或密码错误");
//        }
        T_user user = getBaseMapper().selectOne(new QueryWrapper<T_user>().eq("username", userDto.getUname()));
        if (user != null){
            if (user.getPassword().equals(EncryptionUtil.AESEnc(SystemConfig.PASSKEY,userDto.getUpass()))){
                UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassword());
                Subject subject = SecurityUtils.getSubject();
                subject.login(token);
                return RUtil.setOK("登录成功");
            }
        }
        return RUtil.setERROR("用户名或密码错误");
    }

    @Override
    public R logOut() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return RUtil.setOK("OK");
    }
}
