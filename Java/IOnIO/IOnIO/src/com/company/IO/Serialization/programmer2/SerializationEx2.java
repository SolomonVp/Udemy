package com.company.IO.Serialization.programmer2;

import com.company.IO.Serialization.programmer1.Employee;

import java.io.*;

// Чтобы объект сериализировался, необходимо его отметить(имплетментировать) как Serializable;
// В нашем случае отметить класс Employee!

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee TheBestEmployee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))){
            TheBestEmployee = (Employee) inputStream.readObject();
            System.out.println("\n" + TheBestEmployee);
            System.out.println("\n" + "Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
