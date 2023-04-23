package com.mazlumabul.microservices.limitservice.controller;

import com.mazlumabul.microservices.limitservice.config.Configuration;
import com.mazlumabul.microservices.limitservice.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limit retrieveLimits(){
       // return new Limit(1,100);
        return new Limit(configuration.getMinimum(), configuration.getMaximum());
    }
}
