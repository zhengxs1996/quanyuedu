package com.qfedu.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName VipApplication
 * @Description TODO
 * @Author wangzhendong
 * @Date 2019/9/21
 */
@SpringBootApplication
@EnableDiscoveryClient //注册服务
@MapperScan("com.qfedu.provider.dao")
public class VipApplication {
    public static void main(String[] args) {
        SpringApplication.run(VipApplication.class, args);
    }
}
