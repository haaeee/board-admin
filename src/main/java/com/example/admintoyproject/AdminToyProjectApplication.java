package com.example.admintoyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class AdminToyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminToyProjectApplication.class, args);
    }

}
