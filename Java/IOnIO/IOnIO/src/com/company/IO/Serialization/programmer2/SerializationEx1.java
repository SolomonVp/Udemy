package com.company.IO.Serialization.programmer2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Сериализация - это процесс преобразования объекта в последовательность байт.
// ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test2.bin"));

// Десериализация - это процесс восстановления объекта из этих байт.
// ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test2.bin"));

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"));
                ) {
            employees = (ArrayList) inputStream.readObject();
            System.out.println("\n" + employees);
            System.out.println("\n" + "Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
