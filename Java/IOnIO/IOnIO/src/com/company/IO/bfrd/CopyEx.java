package com.company.IO.bfrd;


// Использование буфферизации в стримах позволяет достичь
// большей эффективности при чтении файла или записи в него.

// BufferedReader и BufferedWriter - это обертки,
// которые оборачивают FileWriter и FileReader добавляя функциональность буферизации.

// BufferedWriter write = new BufferedWriter(new FileWriter("file1.txt");
// BufferedReader reader = new BufferedReader(new FileReader("file1.txt");

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("text2.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("text3.txt"))
        ) {
//            int character;
//            while ((character=reader.read())!=-1) {
//                writer.write(character);
//            }


            String line;
            while ((line= reader.readLine()) != null) {
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
