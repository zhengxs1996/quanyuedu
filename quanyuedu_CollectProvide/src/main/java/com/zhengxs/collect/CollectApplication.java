package com.zhengxs.collect;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: CollectApplication
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/21  16:12
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zhengxs.collect.dao")
public class CollectApplication {
    public static void main(String[] args) {
        SpringApplication.run(CollectApplication.class, args);
    }
}
