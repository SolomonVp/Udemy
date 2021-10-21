package com.zaurtregulov.spring.spring_introduction;

public class Dog implements Pet{
    private String name;
    public Dog() {
        System.out.println("Dog bean is created!");
    }

    @Override
    public void say () {
        System.out.println("- Гав-Гав-Гав, я твой пёсель!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
