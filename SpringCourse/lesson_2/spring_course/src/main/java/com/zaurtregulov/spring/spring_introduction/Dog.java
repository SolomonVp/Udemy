package com.zaurtregulov.spring.spring_introduction;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean is created!");
    }

    @Override
    public void say () {
        System.out.println("- Гав-Гав-Гав, я твой пёсель!");
    }
}