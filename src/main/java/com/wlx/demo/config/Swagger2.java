package com.wlx.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zhangpan on 2017/5/31.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    //以文档的方式输出到在线文档

    @Bean
    public Docket createTestApi() throws Exception{
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wlx.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo apiInfo() throws  Exception{
        return new ApiInfoBuilder()
                .title("TaskManagement-Server任务管理模块 APIs")
                .description("这是电信深交所项目")
                .termsOfServiceUrl("http://www.wust.edu.cn/default.html")
                .contact("武汉科技大学计算机学院ontoweb实验室")
                .version("1.0")
                .build();
    }
}
