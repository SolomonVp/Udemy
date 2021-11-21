package com.company.IO.Serialization.programmer1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Сериализация - это процесс преобразования объекта в последовательность байт.
// ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test2.bin"));

// Десериализация - это процесс восстановления объекта из этих байт.
// ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test2.bin"));


public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Zaur");
        employees.add("Ivan");
        employees.add("Elena");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"));
                ) {
            outputStream.writeObject(employees);
            System.out.println("\n" + "Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
