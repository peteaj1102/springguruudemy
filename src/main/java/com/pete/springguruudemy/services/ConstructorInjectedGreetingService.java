package com.pete.springguruudemy.services;

import org.springframework.stereotype.Service;

/**
 * Created by Petea on 22:23 27 Aug, 2020
 */
@Service
public class ConstructorInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World Constructor";
    }
}
