package com.company.IO.FRandFW;

import java.io.FileReader;
import java.io.IOException;


// Запись текста в файл. FileReader|FileWriter используются для работы с тектовыми файлами.
// FileWriter writer = new FileWriter("file1.txt");
// FileReader reader = new FileReader("file1.txt");
// Никогда не забывайте закрывать стримы после использоания.
public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("text2.txt");
            int character;
            while ((character= reader.read())!=-1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Congratulations! Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
