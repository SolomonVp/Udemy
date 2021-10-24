package com.zaurtregulov.spring.spring_introduction;

import org.springframework.stereotype.Component;

@Component // dog
public class Dog implements Pet{
//    private String name;
    public Dog() {
        System.out.println("Dog bean is created!");
    }

    @Override
    public void say () {
        System.out.println("- Гав-Гав-Гав, я твой пёсель!");
    }

    public void init() {
        System.out.println("Class Dog: init-method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy-method");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
