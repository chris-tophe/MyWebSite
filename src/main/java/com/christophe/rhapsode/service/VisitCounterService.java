package com.christophe.rhapsode.service;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class VisitCounterService {
    private Map<String,Integer> uniqueIpCounter;

    public VisitCounterService(){
        uniqueIpCounter = new LinkedHashMap<String, Integer>();
    }

    public Map<String, Integer> getUniqueIpCounter() {
        return uniqueIpCounter;
    }

    public void increaseCount(String ip){
        Integer currentIpCount = uniqueIpCounter.get(ip);
        if (currentIpCount == null){
            uniqueIpCounter.put(ip,1);
        }
        else {
            uniqueIpCounter.put(ip,currentIpCount + 1);
        }

    }
}

