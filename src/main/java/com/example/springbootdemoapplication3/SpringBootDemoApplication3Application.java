package com.example.springbootdemoapplication3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "SpringBootDemoApp3HelloController")
public class SpringBootDemoApplication3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication3Application.class, args);
    }

}
