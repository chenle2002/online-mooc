package com.chenle.ossservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.chenle.ossservice","com.chenle.common"})
public class OssServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssServiceApplication.class, args);
    }

}
