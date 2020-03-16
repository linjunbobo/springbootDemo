package com.example.demo.Confi;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/2/26 9:45
 */
@Configuration
@EnableSwagger2
//@EnableSwaggerBootstrapUi
public class SwaggerConfig {
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("项目名称")
                .description("项目详情")
                .termsOfServiceUrl("http://localhost:8080/")//项目地址
                .contact(new Contact("linjunbo","https://blog.csdn.net/weixin_41930050","447527623@qq.com"))
                .version("1.0")//项目版本
                .build();
    }
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.Controller")) //这里写的是API接口所在的包位置
                .paths(PathSelectors.any())
                .build();
    }

}
