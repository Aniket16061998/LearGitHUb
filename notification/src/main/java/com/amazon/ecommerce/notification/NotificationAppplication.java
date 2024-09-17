package com.amazon.ecommerce.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class NotificationAppplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationAppplication.class,args);
    }
}
