package com.pete.springguruudemy;

import com.pete.springguruudemy.controllers.ConstructorInjectedController;
import com.pete.springguruudemy.controllers.MyController;
import com.pete.springguruudemy.controllers.PropertyInjectedController;
import com.pete.springguruudemy.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringguruudemyApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(SpringguruudemyApplication.class, args);
        MyController myController= (MyController) ctx.getBean("myController");
        String greeting=myController.sayHello();

        System.out.println(greeting);

        System.out.println("---------Property");
        PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---------Setter");
        SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------Constructor");
        ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }
}
