package com.company.IO.try_with_resouкces;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



// Если выброшен в сигнатуру метода IOException, то catch не обязателен.
// Ресурс, который используется в try-with-resources должен имплеменировать Autocloseable.
// С try-with-resources не нужен блок finally.
public class FileReaderEx2 {
    public static void main(String[] args) throws IOException {

        try(FileReader reader = new FileReader("text2.txt");
            FileWriter writer = new FileWriter("text2.txt", true)) {
            int character;
            while ((character= reader.read())!=-1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Congratulations! Done!");
        }
    }
}
