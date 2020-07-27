package com.christophe.rhapsode.controller;

import com.christophe.rhapsode.service.VisitCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class VisitCounterController {

    @Autowired
    VisitCounterService visitCounterService;

    @GetMapping(value = "/stats/ips")
    public Map<String,Integer> getIpsCount(){
        return visitCounterService.getUniqueIpCounter();
    }
}
