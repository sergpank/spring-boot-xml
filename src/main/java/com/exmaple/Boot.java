package com.exmaple;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Boot.class);
        app.run();
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("BOOT started.");
    }
}
