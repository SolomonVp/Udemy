package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(3, "Victor", "Sh.", 0);
        Employee employee2 = new Employee(123, "Vova", "K.", 12000);
        Employee employee3 = new Employee(1, "Olya", "Sh.", 50000);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Before sorting \n " + list);
        Collections.sort(list);
        System.out.println("After sorting \n " + list);
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ComparableAndComparator_2_3.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(Employee o) {
                                                                // Способ 1.
//        if (this.id == o.id) {
//            return 0;
//        } else if (this.id < o.id) {
//            return -1;
//        } else {
//            return 1;
//        }
                                                                // Способ 2.
//        return this.id-o.id;

                                                                // Способ 3 - если id не int, а Integer.
//        return this.id.compareTo(o.id);
                                                                // Способ 4 - сортировка по имени.
//                return this.name.compareTo(o.name);
                                                                // Способ 5 - если имена равны, то сравниваем по фамилиям.
        int res = this.name.compareTo(o.name);
        if (res==0) {
            res = this.surname.compareTo(o.surname);
        }
        return res;
    }
}
