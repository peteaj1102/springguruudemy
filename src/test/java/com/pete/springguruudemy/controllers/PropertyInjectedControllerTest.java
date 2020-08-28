package com.pete.springguruudemy.controllers;

import com.pete.springguruudemy.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Petea on 22:25 27 Aug, 2020
 */
class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController=new PropertyInjectedController();
        propertyInjectedController.greetingService=new ConstructorInjectedGreetingService();
    }

    @Test
    void sayGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}