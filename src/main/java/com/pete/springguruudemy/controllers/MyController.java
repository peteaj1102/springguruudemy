package com.pete.springguruudemy.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Petea on 21:38 27 Aug, 2020
 */

@Controller
public class MyController {
public String sayHello(){
    System.out.println("Hello Word!!!");

    return "Hi Petea!!";
}


}
