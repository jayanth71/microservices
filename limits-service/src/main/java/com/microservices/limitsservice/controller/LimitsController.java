package com.microservices.limitsservice.controller;

import com.microservices.limitsservice.bean.Limits;
import com.microservices.limitsservice.configuration.Configuration;
import com.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @GetMapping("/limits")
    public Limits retreiveLimits(){
        Configuration configuration = new Configuration() ;

        return new Limits(configuration.getMinimum(), configuration.getMaximum());  

    }
}
