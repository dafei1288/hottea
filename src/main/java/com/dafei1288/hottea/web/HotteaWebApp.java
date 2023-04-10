package com.dafei1288.hottea.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AutoConfiguration
@SpringBootApplication(scanBasePackages="com.dafei1288.hottea.web.*")
public class HotteaWebApp {
    public static void main(String[] args) {
        SpringApplication.run(HotteaWebApp.class, args);
    }
}
