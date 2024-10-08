package com.ashuboi.gameapp.Configuration;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Welcome to AshuBois World";
    }

    @Bean
    public String name() {
        return "AshuBoi";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Ashu", 22, new AddressHome("hero","london"));
    }

//    @Bean(name = "YourCustomBeanName")
    @Bean(name = "address2")
    @Primary
    public AddressHome address(){
        return new AddressHome("Ashu", "New York");
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    @Qualifier("address3Qualifier")
    public Person person3Parameters(String name, int age, AddressHome address){
        return new Person(name(), age(),  address());
    }
//    @Bean
//    public Person person3Parameters(String name, int age, AddressHome address){
//        return new Person(name(), age(), address());
//    }


}
