package com.company.igra;

public class Test {
    public static void main(String[] args) {
        Schooler schoolar1 = new Schooler("Ivan", 3);
        Schooler schoolar2 = new Schooler("Mariya", 4);

        Student student1 = new Student("Vova", 23);
        Student student2 = new Student("Ilya", 24);

        Employee employee1 = new Employee("Vika", 33);
        Employee employee2 = new Employee("Stas", 34);

        Team<Schooler> schoolarTeam = new Team<>("Драконы");
        Team<Student> studentTeam = new Team<>("Чмо");
        Team<Employee> employeeTeam = new Team<>("Мужики");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schooler> schoolarTeam2 = new Team<>("Мудрецы");
        Schooler schoolar3 = new Schooler("Пехо", 4);
        Schooler schoolar4 = new Schooler("Мухо", 3);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        System.out.println("");
        schoolarTeam.playWith(schoolarTeam2);

    }
}
