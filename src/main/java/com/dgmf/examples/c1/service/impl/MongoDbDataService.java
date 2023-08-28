package com.dgmf.examples.c1.service.impl;

import com.dgmf.examples.c1.service.DataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {11, 22, 33, 44, 55};
    }
}
