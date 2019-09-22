package com.zhengxs.collectapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: CollectApiApplication
 * @Description: TODO
 * @author: zhengxs
 * @date: 2019/9/21  19:27
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
public class CollectApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CollectApiApplication.class, args);
    }
}
