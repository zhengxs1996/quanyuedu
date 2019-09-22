package com.cc.springRead;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ReadDownloadApplication
 * @Description
 * @Author cc
 * @Date 2019/9/21 14:44
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.cc.springRead.dao") //扫描Mybatis的Dao层
@EnableDiscoveryClient //注册服务
public class ReadDownloadApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReadDownloadApplication.class, args);
    }
}
