package com.company.IO.FiS_FoS;


import java.io.*;

// FiS и FoS используются для работы с бинарными файлами.
// FileInputStream input = new FileInputStream("test2.bin");
// FileOutputStream output = new FileOutputStream("test2.bin");
public class FiS_FoS {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("E:\\" +
                "Java\\Projects\\Udemy\\1.jpg");
             FileOutputStream outputStream = new FileOutputStream("1.jpeg")
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
