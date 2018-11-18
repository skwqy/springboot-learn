package com.skwqy.work.springbootlearn.boot;

import com.skwqy.work.springbootlearn.SpringbootLearnApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author skwqy
 * @Created on 2018 11 2018/11/18 8:25 AM
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.skwqy.work.springbootlearn.controller","com.skwqy.work.springbootlearn.service"})
@MapperScan(basePackages = {"com.skwqy.work.springbootlearn.dao"})
public class StartUp {

    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }
}
