package com.shree.template.ThymleafTemplating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class ThymleafTemplatingApplication {

    public static void main(String[] args) {

        SpringApplication.run(ThymleafTemplatingApplication.class, args);
        render();
    }

    private static void render() {
        System.out.println("Hello world");
    }

}
