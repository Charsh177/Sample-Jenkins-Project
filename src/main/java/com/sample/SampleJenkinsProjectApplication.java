package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleJenkinsProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleJenkinsProjectApplication.class, args);
        System.out.println("Sample project running successfully...");
    }

}
