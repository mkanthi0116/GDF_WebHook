package com.mohan.javaprojects.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.mohan.javaprojects")
@SpringBootApplication
public class MyfirstappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfirstappApplication.class, args);
    }

}
