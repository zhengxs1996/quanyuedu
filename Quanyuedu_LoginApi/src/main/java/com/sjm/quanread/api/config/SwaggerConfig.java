package com.sjm.quanread.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @ClassName SwaggerConfig
 * @Description TODO
 * @Author lyj
 * @Date 2019/9/21 16:37
 * @Version 1.0
 */
@Configuration
public class SwaggerConfig {
    private ApiInfo createAI(){
        return new ApiInfoBuilder().title("泉阅读登录数据接口").
                description("一款读书app")
                .version("0.1")
                .contact(new Contact("lyj","http://111","sjm_undo@163.com")).build();
    }
    @Bean
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAI()).select().apis
                (RequestHandlerSelectors.basePackage("com.sjm.quanread.api.controller")).build();
    }
}
