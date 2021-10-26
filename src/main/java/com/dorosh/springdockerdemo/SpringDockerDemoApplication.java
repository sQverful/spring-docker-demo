package com.dorosh.springdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerDemoApplication {

    @RequestMapping("/")
    public String hello() {
        return "Hello Docker World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerDemoApplication.class, args);
    }

}
