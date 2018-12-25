package com.anfachina.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author lengleng
 * @date 2017年10月27日13:59:05
 */
@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.anfachina.admin", "com.anfachina.common.bean"})
public class AnfaAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AnfaAdminApplication.class, args);
    }
}