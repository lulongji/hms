package com.hms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.hms.dao")
public class HMSApplication {

    public static void main(String[] args) {

        SpringApplication.run(HMSApplication.class, args);

    }


}
