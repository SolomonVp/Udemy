package sorted;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test5_2 {
    public static void main(String[] args) {
        Student2 stt1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 stt2 = new Student2("Nikolay", 'm', 28, 2, 6.4);
        Student2 stt3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 stt4 = new Student2("Petr", 'm', 35, 4, 7.0);
        Student2 stt5 = new Student2("Mariya", 'f', 23, 3, 7.4);
        List<Student2> students2 = new ArrayList<>();
        students2.add(stt1);
        students2.add(stt2);
        students2.add(stt3);
        students2.add(stt4);
        students2.add(stt5);

        students2 = students2.stream().sorted((x, y) ->
                x.getName().compareTo(y.getName())
                ).collect(Collectors.toList());
        System.out.println(students2);

    }
}

class Student2 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
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
