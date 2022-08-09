package com.mustafa.microserviceone.controller;

import com.mustafa.microserviceone.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceController {

    @Autowired
    Configuration configuration;

    @GetMapping("/endpoint")
    public String retrieveLimits(){
        return configuration.getValue();
    }

}
