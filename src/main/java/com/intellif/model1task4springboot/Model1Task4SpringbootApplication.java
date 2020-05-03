package com.intellif.model1task4springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan("com.intellif.model1task4springboot.*")
public class Model1Task4SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Model1Task4SpringbootApplication.class, args);
    }

}
