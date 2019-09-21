package com.cc.springread.top.api;

import net.bytebuddy.build.ToStringPlugin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName TopApiApplication
 * @Description TODO
 * @Author lyj
 * @Date 2019/9/21 14:14
 * @Version 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
@EnableSwagger2
public class TopApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TopApiApplication.class, args);
    }
}
