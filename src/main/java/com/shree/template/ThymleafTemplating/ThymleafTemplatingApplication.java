package com.shree.template.ThymleafTemplating;

import com.shree.template.ThymleafTemplating.service.TemplatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymleafTemplatingApplication {



    public static void main(String[] args) {

        SpringApplication.run(ThymleafTemplatingApplication.class, args);
        TemplatingService templatingService = new TemplatingService();
        templatingService.trigger();
   }




}
