package com.sjm.springread.login.shiro;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Service;

/**
 * @program: quanyuedu
 * @description:
 * @author: sjm
 * @create: 2019-09-22 11:14
 **/
@Service
public class MyRealm extends AuthorizingRealm {

    //授权，查询当前用户的权限和角色
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    //认证，验证登录是否成功
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        if (token!=null){
            return new SimpleAuthenticationInfo(token.getUsername(),token.getPassword(),getName());
        }
        return null;
    }
}
