package com.pete.springguruudemy.controllers;

import com.pete.springguruudemy.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Petea on 22:30 27 Aug, 2020
 */
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public  void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
