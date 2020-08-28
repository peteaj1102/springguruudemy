package com.pete.springguruudemy.services;

import org.springframework.stereotype.Service;

/**
 * Created by Petea on 16:10 28 Aug, 2020
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello word Setter";
    }
}
