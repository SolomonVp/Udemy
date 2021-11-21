package com.company.IO.Serialization.programmer1;

import java.io.Serializable;


// Для того,чтобы объект класса можно было сериализировать, класс должен имплементировать интерфейс Serializable.
// Поля класса, помеченные ключевым словом transient, не записываются в файл при сериализации.
// В сериализированном классе необходимо использовать serialVersionUID для обозначения версии класса.

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String sureName;
    String department;
//    int age;
    transient double salary;
    Car car;

    public Employee(String name,
                    String sureName,
                    String department,
//                    int age,
                    double salary,
                    Car car) {
        this.name = name;
        this.sureName = sureName;
        this.department = department;
//        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "\n" +
                name + " " +
                sureName + " " +
                department + " " +
//                age + " " +
                salary + " " +
                car;
    }
}
