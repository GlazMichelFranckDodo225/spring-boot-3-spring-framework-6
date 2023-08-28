package com.dgmf.examples.c1.service.impl;

import com.dgmf.examples.c1.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class MySqlDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    }
}
