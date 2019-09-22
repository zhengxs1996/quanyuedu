package com.sjm.springread.login;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: quanyuedu
 * @description:
 * @author: sjm
 * @create: 2019-09-21 20:41
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.sjm.springread.login.dao")
public class LoginApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class,args);
    }
}
