package mapToInt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// возвращает не просто стрим, а стрим, который содержит элементы int.
// Так же существуют типы Double и др.
public class MapToInt {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()                               // метод просто конвертирует значения int в значения Integer
                .collect(Collectors.toList());
        System.out.println(courses);


        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();                             // метод просуммирует наши элементы
        System.out.println(sum);

        double average = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();    // метод выведет среднее значение
        System.out.println(average);

        int min = students.stream().mapToInt(el -> el.getCourse())
                .min().getAsInt();                                                                     // метод выведет мин элемент
        System.out.println(min);

        int max = students.stream().mapToInt(el -> el.getCourse())
                .max().getAsInt();                                                                     // метод выведет макс элемент
        System.out.println(max);

    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return name + " " + sex + " " + age + " " + course + " " + avgGrade;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public double getAvgGrade() {
        return avgGrade;
    }
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
