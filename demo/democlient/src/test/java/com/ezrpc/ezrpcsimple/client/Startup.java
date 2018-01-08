package com.ezrpc.ezrpcsimple.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by nicholasyan on 17/8/16.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.ezrpc.ezrpcsimple")
public class Startup {
    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);

    }

}
