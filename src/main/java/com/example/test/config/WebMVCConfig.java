package com.example.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/15 18:30
 */
@Configuration
public class  WebMVCConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/mypic/");
    }

//    @Configuration
//    public class MyMVCConfige extends WebMvcConfigurationSupport{
//        @Override
//        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            registry.addResourceHandler("/fileData/**").addResourceLocations("classpath:/myFile/");
//            super.addResourceHandlers(registry);
//        }
//    }
}