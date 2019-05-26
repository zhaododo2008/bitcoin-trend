package com.bitcoin.analysis.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhaododo
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BitcoinTrendApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BitcoinTrendApplication.class)
                .properties("spring.profiles.active=nacos")
                .run(args);
    }

}
