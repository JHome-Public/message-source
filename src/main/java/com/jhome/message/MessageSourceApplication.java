package com.jhome.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MessageSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageSourceApplication.class, args);
    }

}