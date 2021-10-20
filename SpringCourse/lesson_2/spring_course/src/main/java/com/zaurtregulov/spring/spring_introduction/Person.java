package com.zaurtregulov.spring.spring_introduction;

public class Person {
    private Pet pet;
    private String surName;
    private int age;

    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        System.out.println("Class Person: set surname");
        this.surName = surName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("");
        System.out.println("- Привет, питомец!");
        pet.say();
    }
}
