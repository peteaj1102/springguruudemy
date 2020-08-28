package com.pete.springguruudemy.controllers;

import com.pete.springguruudemy.services.GreetingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Petea on 22:35 27 Aug, 2020
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
