package com.lab.ms.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApp.class, args);
    }

}