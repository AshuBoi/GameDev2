package com.ashuboi.gameapp.Example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass1{

    Dependency10 dependency1;
    Dependency20 dependency2;

    public Dependency10 getDependency1() {
        return dependency1;
    }

    public Dependency20 getDependency2() {
        return dependency2;
    }


    // one feature about constructor injection is that you can use it without autowired anotation
    @Autowired
    public YourBusinessClass1(Dependency10 dependency1, Dependency20 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }

    public String toString(){
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency10{}

@Component
class Dependency20{}

@Configuration
@ComponentScan()
public class DepInjectionLauncherSetter {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
