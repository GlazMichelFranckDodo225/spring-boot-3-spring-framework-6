package com.dgmf.learnspringframework.examples.c1.service;

import com.dgmf.learnspringframework.examples.c1.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {
    private DataService dataService;

    // Constructor Injection
    @Autowired
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
