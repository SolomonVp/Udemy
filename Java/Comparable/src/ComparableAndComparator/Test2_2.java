package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2_2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person p1 = new Person(1, 12, "Alla");
        Person p2 = new Person(14, 21, "Victor");
        Person p3 = new Person(123, 43, "Olga");
        Person p4 = new Person(2, 34, "Petr");

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}

class Person implements Comparable<Person> {
    int id;
    int age;
    String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "ComparableAndComparator_2_3.Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(ComparableAndComparator_2_3.Person o) {
//        return this.id-o.id;
//    }


//    @Override
//    public int compareTo(ComparableAndComparator_2_3.Person o) {
//        return this.age-o.age;
//    }


    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
