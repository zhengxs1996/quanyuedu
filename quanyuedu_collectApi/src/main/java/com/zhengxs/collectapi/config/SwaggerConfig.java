package com.zhengxs.collectapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 *@Author zhengxs
 *@Date Created in 2019/7/8 16:08
 */
@Configuration
public class SwaggerConfig {

    private ApiInfo createAI(){
        return new ApiInfoBuilder().title("泉阅读收藏服务数据接口").
                description("基于SpringCloud实现的泉阅读微服务项目，该产品是一款立足中原二七的多年线下经验的阅读平台，目前主打线上用户免费阅读，方便快捷！")
                .version("0.1")
                .contact(new Contact("zhengxs","http://111","engineer921284756.@163.com")).build();
    }
    @Bean
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAI()).select().apis
                (RequestHandlerSelectors.basePackage("com.zhengxs.collectapi.api")).build();
    }
}
