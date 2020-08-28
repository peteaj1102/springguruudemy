package com.pete.springguruudemy.services;

import org.springframework.stereotype.Service;

/**
 * Created by Petea on 16:07 28 Aug, 2020
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Word Property";
    }
}
