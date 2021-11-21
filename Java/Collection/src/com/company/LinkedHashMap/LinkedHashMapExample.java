package com.company.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Objects;


// последовательность элементов зависит от вызова элементов, если последний был get(2), то он и будет посленим в списке.
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<Double, Student>(16, 0.75f, false);

        Student st1 = new Student("Zaur", "T", 3);
        Student st2 = new Student("Mariya", "I", 1);
        Student st3 = new Student("Sergey", "P", 4);
        Student st4 = new Student("Igor", "S", 2);


        lhm.put( 5.8, st3);
        lhm.put( 6.4, st4);
        lhm.put( 7.2, st1);
        lhm.put( 7.5, st2);

        System.out.println(lhm);
        System.out.println(lhm.get(5.8));
        System.out.println(lhm.get(7.5));

        System.out.println(lhm);
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
