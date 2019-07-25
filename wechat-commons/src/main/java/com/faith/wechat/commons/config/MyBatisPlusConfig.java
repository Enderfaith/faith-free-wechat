package com.faith.wechat.commons.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisPlusConfig$
 * @Description mybatis plus 配置
 * @Author faith$
 * @Date 2019/7/24
 * @Version 1.0
 **/

@Configuration
@MapperScan(basePackages = "com.faith.wechat.*.dao")
public class MyBatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType("MYSQL");
        return paginationInterceptor;
    }
}
