package com.sjm.quanread.api.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: talentshow
 * @description:
 * @author: sjm
 * @create: 2019-09-10 23:33
 **/
@Configuration
public class FeignConfig {
    private int connecttimeout=10000;//10秒
    private int readtimeout=10000;//10秒
    @Bean
    public Request.Options createOp(){
        return new Request.Options(connecttimeout,readtimeout);
    }
}
