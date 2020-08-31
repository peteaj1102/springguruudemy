package com.pete.springguruudemy.controllers;

import com.pete.springguruudemy.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Petea on 21:38 27 Aug, 2020
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
    return greetingService.sayGreeting();
}


}
