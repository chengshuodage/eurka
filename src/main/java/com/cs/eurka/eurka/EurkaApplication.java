package com.cs.eurka.eurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurkaApplication.class, args);
    }

}
