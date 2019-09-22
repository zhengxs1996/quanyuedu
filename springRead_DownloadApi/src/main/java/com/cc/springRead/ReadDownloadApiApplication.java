package com.cc.springRead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName ReadDownloadApiApplication
 * @Description
 * @Author cc
 * @Date 2019/9/21 15:59
 * @Version 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient //进行服务发现
@EnableFeignClients //启用Feign
@EnableSwagger2
public class ReadDownloadApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReadDownloadApiApplication.class, args);
    }
}
