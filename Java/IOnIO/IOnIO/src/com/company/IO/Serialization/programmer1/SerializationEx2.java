package com.company.IO.Serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Чтобы объект сериализировался, необходимо его отметить(имплетментировать) как Serializable;
// В нашем случае отметить класс Employee и Car!

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car(
                "Nissan Tiida",
                "white");
//        Employee employee = new Employee("Mariya",
//                "Ivanova",
//                "IT",
////                28,
//                500,
//                car);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))){
//            outputStream.writeObject(employee);
            System.out.println("\n" + "Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
