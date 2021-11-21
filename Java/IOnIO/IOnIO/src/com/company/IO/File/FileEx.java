package com.company.IO.File;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Класс File позволяет управлять информацией о файлах и директориях.
// File file = new File("text2.txt");
// .getAbsolutePath   - получение абсолютного пути
// .isAbsolute        - проверяет, абсолютный путь или нет
// .isDirectory       - является ли наш файл директорией
// .exists            - проверяет чуществует ли файд
// .createNewFile     - создает новый файл
// .mkdir             - создает новую дирректорию
// .length            - размер файла (размер папки высчитывается вручную по размерам файла)
// .delete            - удаление файла или папки (метод не удалит папку, если папка не пуста)
// .listFiles         - проверить содержимое папки
// .isHidden          - проверяет скрыта ли папка
// .canRead           - есть ли доступ на чтение
// .canWrite          - есть ли доступ на запись
// .canExecute        - есть ли доступ на запуск
public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("text2.txt");
        File folder = new File("E:\\Java\\Projects\\Udemy\\A");
        File file2 = new File("E:\\Java\\Projects\\Udemy\\A\\test1.txt");
        File folder2 = new File("E:\\Java\\Projects\\Udemy\\B");
        System.out.println(" ");
        System.out.println("file.getAbsolutePath():" + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath():" + folder.getAbsolutePath());
        System.out.println(" ");
        System.out.println("file.isAbsolute():" + file.isAbsolute());
        System.out.println("folder.isAbsolute():" + folder.isAbsolute());
        System.out.println(" ");
        System.out.println("file.isDirectory():" + file.isDirectory());
        System.out.println("folder.isDirectory():" + folder.isDirectory());
        System.out.println(" ");
        System.out.println("file.exists():" + file.exists());
        System.out.println("file2.exists():" + file2.exists());
        System.out.println("folder.exists():" + folder.exists());
        System.out.println("folder2.exists():" + folder2.exists());
        System.out.println(" ");
        System.out.println("file2.createNewFile():" + file2.createNewFile());
        System.out.println("folder2.createNewFile():" + folder2.mkdir());
        System.out.println(" ");
        System.out.println("file2.length():" + file2.length());
        System.out.println("folder.length():" + folder.length());
        System.out.println(" ");
//        System.out.println("folder.delete():" + folder.delete());
//        System.out.println("folder2.delete():" + folder2.delete());
//        System.out.println("file2.delete():" + file2.delete());
//        System.out.println(" ");
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println(" ");
        System.out.println("file2.isHidden():" + file2.isHidden());
        System.out.println(" ");
        System.out.println("file2.canRead():" + file2.canRead());
        System.out.println(" ");
        System.out.println("file2.canWrite():" + file2.canWrite());
        System.out.println(" ");
        System.out.println("file2.canExecute():" + file2.canExecute());
        System.out.println(" ");

    }
}
