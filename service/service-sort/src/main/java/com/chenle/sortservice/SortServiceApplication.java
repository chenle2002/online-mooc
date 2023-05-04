package com.chenle.sortservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = {"com.chenle.sortservice","com.chenle.common"})
public class SortServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SortServiceApplication.class, args);
    }

}
