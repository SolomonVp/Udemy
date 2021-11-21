package com.company.IO.FRandFW;

import java.io.FileWriter;
import java.io.IOException;

// Запись текста в файл. FileReader|FileWriter используются для работы с тектовыми файлами.
// FileWriter writer = new FileWriter("file1.txt");
// FileReader reader = new FileReader("file1.txt");
// Никогда не забывайте закрывать стримы после использоания.
public class FileWriterEx {

    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной. \n" +
                        "Непонятного нет для меня под луной. \n" +
                        "Мне известно, что мне ничего не известно! \n" +
                        "Вот последняя правда открытая мной.\n";
        String s = "privet";
        FileWriter writer=null;
        try {
//            writer = new FileWriter("E:\\Java\\Projects\\Udemy\\Java\\IOnIO\\IOnIO\\text1.txt");                // можно указать конкретную папку
            writer = new FileWriter("text2.txt", true);                                            // можно создавать в корне проекта, Java сама создаст этот файл
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
//            writer.write(rubai);
            writer.write(s);                                     // произойдет перезапись в фале
            System.out.println("Congratulations! Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();     // если стрим не закрывать, то в файл ничего не запишется.
        }
    }
}
