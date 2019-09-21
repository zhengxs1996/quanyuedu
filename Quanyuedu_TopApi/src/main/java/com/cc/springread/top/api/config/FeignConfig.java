package com.cc.springread.top.api.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author lyj
 * @Date 2019/9/21 16:36
 * @Version 1.0
 */
@Configuration
public class FeignConfig {
    private int connectTimeout = 10000;//10秒
    private int readTimeout = 10000;//10秒
    @Bean
    public Request.Options createOp(){
        return new Request.Options(connectTimeout,readTimeout);
    }
}
