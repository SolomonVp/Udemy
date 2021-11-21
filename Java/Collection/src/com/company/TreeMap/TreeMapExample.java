package com.company.TreeMap;

import java.util.Objects;
import java.util.TreeMap;
// Элементами TreeMap являются пары ключ/значение. В TreeMap элементы хранятся в отсортированном по возрастанию порядке.
// В основе TreeMap лежит красно-черное дерево. Это позволяет методам работать быстро, но не быстрее, чем методы HashMap.
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "T", 3);
        Student st2 = new Student("Mariya", "I", 1);
        Student st3 = new Student("Sergey", "P", 4);
        Student st4 = new Student("Vladimir", "T", 3);
        Student st5 = new Student("Olga", "Z", 1);
        Student st6 = new Student("Irina", "S", 4);
        Student st7 = new Student("Dima", "M", 3);
        treeMap.put( 5.8, st1);
        treeMap.put( 8.8, st7);
        treeMap.put( 7.9, st2);
        treeMap.put( 9.2, st3);
        treeMap.put( 2.4, st4);
        treeMap.put( 1.1, st6);
        treeMap.put( 4.5, st5);

        System.out.println(treeMap);
        System.out.println(treeMap.get(1.1));
        treeMap.remove(5.8);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());                      // разворачивает список на основе ключей
        System.out.println(treeMap.tailMap(7.3));                 // выводит список от 7.3
        System.out.println(treeMap.headMap(2.4));                   // выводит список до 2.4
        System.out.println(treeMap.lastEntry());                          // последний элемент
        System.out.println(treeMap.firstEntry());                         // первыйэлемент
    }
}


class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    @Override
    public String toString() {
        return name + " " + surname + " " + course;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}