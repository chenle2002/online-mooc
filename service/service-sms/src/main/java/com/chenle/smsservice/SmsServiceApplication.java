package com.chenle.smsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.chenle.smsservice","com.chenle.common"})
public class SmsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsServiceApplication.class, args);
    }

}
