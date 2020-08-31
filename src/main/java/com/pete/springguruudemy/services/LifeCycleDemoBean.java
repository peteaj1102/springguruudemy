package com.pete.springguruudemy.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Petea on 18:18 28 Aug, 2020
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware  {

    public LifeCycleDemoBean() {
        System.out.println("Life cycle Demo Starts: \n");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Propreties set to bean\n");
    }

    //////////////////////////////


    @Override
    public void destroy() throws Exception {
        System.out.println("After Destroy the Bean\n");
    }

    /////////////////////////////////


    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is: "+s+"\n");

    }

    ////////////////////////////


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory has been just set\n");
    }

    /////////////////////////

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context has been set\n");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Tbhe Psot construct annotated method has been called\n");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Ready to destroy something");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }

}
