package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods_2 {
    public static void main(String[] args) {
        Student st1 = new Student("A", 'M', 23, 2, 8.3);
        Student st2 = new Student("B", 'W', 24, 3, 5.3);
        Student st3 = new Student("C", 'M', 25, 4, 3.3);
        Student st4 = new Student("D", 'W', 22, 1, 7.3);
        Student st5 = new Student("E", 'M', 21, 1, 9.3);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        Student st6 = new Student("E", 'M', 21, 1, 9.3);
        
        // без переопределения equals() ОБЬЪЕКТ НЕ УДАЛИТСЯ!

        studentList.remove(st6);
        System.out.println(studentList);
    }
}
class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGradle;

    public Student(String name, char sex, int age, int course, double avgGradle) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGradle = avgGradle;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGradle=" + avgGradle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGradle, avgGradle) == 0 &&
                Objects.equals(name, student.name);
    }
}
