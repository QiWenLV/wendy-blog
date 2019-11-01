package com.zqw.wendyadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zqw.wendyadmin.image.dao")
public class WendyAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WendyAdminApplication.class, args);
    }

}
