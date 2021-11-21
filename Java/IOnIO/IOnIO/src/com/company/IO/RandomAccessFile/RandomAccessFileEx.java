package com.company.IO.RandomAccessFile;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

// Класс RandomAccessFile позволяет читать информацию из любого места файла и записывать информацию в любое место файла.
// java.io.RandomAccessFile file = new java.io.RandomAccessFile("test10.txt", "rw");
public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")){

            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(56);         // передвигает поинтер на позицию 101
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer();     // позволяет узнать на какой позиции находится поинтер
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("privet ");  // перемещается на нулевую позицию и пишем в начало "привет(англ)"

            file.seek(file.length() - 1);
            file.writeBytes(" \n                Kids");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
