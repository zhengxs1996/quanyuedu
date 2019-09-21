package com.cc.springRead.top;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName TopApplication
 * @Description TODO
 * @Author lyj
 * @Date 2019/9/21 9:04
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cc.springRead.top.dao")
@EnableScheduling
public class TopApplication {
    public static void main(String[] args) {
        SpringApplication.run(TopApplication.class, args);
    }
}
