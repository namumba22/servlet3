package com.web.servlet3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by dumin on 2/22/17.
 */
@SpringBootApplication
public class StartPoint extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StartPoint.class);
    }

    private static void main(String... s) {
        SpringApplication.run(StartPoint.class, s);
    }
}
