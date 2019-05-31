package com.bitcoin.analysis.web;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhaododo
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.bitcoin.analysis"})
@MapperScan("com.bitcoin.analysis.**.mapper")
public class BitcoinTrendApplication {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


    public static void main(String[] args) {
        new SpringApplicationBuilder(BitcoinTrendApplication.class)
                .properties("spring.profiles.active=nacos")
                .run(args);
    }

}
