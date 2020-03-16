package com.example.demo;


import com.example.demo.Confi.ApplicationListenTest;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
      //  SpringApplication.run(DemoApplication.class, args);
        new SpringApplicationBuilder().sources(DemoApplication.class)
                .listeners(new ApplicationListenTest()).run(args);
    }

}

