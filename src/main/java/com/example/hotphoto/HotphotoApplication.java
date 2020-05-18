package com.example.hotphoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.hotphoto")
public class HotphotoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HotphotoApplication.class, args);
    }

}
