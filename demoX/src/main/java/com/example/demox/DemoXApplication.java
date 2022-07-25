package com.example.demox;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

//Application creation class
@SpringBootApplication
public class DemoXApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoXApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext car) {
        return args -> {
            System.out.println("Let's inspect the cars provided by Spring Boot");
            String[] carNames = car.getBeanDefinitionNames();
            Arrays.sort(carNames);
            for (String carName : carNames) {
                System.out.println(carName);
            }
        };
    }

}
