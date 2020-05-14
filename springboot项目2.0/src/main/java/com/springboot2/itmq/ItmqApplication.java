package com.springboot2.itmq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Springbootapplication :是一个主程序类，标注这个是一个springboot应用
 *
 * */
@EnableRabbit
@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public class ItmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItmqApplication.class, args);
    }

}
