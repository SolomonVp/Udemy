package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3_1 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();

        Employee2 emp1 = new Employee2(1, "Grigoryan", "Alla", 12000);
        Employee2 emp2 = new Employee2(14, "Skotina", "Victor", 3000);
        Employee2 emp3 = new Employee2(123, "O-lya-lya", "Olga", 18000);
        Employee2 emp4 = new Employee2(2, "Fetovalschik", "Petr", 5000);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        System.out.println(list);
        Collections.sort(list, new SalaryComparator());
        System.out.println(list);

    }
}

class Employee2 {
    int id;
    String name;
    String surname;
    int salary;


    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ComparableAndComparator_2_3.Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

}

// Сортировка по ID (В сортировке обязательно указывать какой класс использовать, IDComparator или к примеру ComparableAndComparator_2_3.NameComparator)
class IdComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        if (o1.id == o2.id) {
            return 0;
        } else if (o1.id < o2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
// Сортировка по name
class NameComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.name.compareTo(o2.name);
    }
}

// Сортировка по salary
class SalaryComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.salary- o2.salary;
    }
}
