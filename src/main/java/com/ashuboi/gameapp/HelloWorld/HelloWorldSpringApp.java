package com.ashuboi.gameapp;


import com.ashuboi.gameapp.Configuration.AddressHome;
import com.ashuboi.gameapp.Configuration.HelloWorldConfiguration;
import com.ashuboi.gameapp.Configuration.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class HelloWorldSpringApp {
    public static void main(String[] args) {
        // 1: Launch a Spring Context
        // 2: Configure the things that we want Spring to manage - @Configuration
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("helloWorld"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        // you can also call the beans by their class name
        // System.out.println(context.getBean(AddressHome.class));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
//        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(AddressHome.class));
        System.out.println(context.getBean("address3Qualifier"));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
