package com.lml.boot.mybatis.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.lml.boot.mybatis.springboot.city")
public class MybatisSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringbootApplication.class, args);
    }
}
