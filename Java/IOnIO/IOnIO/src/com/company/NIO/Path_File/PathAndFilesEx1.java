package com.company.NIO.Path_File;

// Объект типа Path представляет собой путь к файлу или деректории.
// Path path = Paths.get("text1.txt");
// Files - утилитный класс, который содержит очень много полезных методов для работы с файлами и директориями.

// .getFileName() - возвращает имя файла или директории в которой расположен объект.
// .getParent() - возврат родителя
// .getRoot() - корень дирректории
// .isAbsolute() - проверяет абсолютный путь или нет
// .toAbsolutePath() - узнать какой абсолютный путь
// .relativize() - относительный путь относительно другого пути нашего объекта

// .isReadable() - проверяет права на Path, можем ли читать
// .isWriteable() - можем ли записывать
// .isExecutable() - можем ли изменять


import java.io.IOException;
import java.nio.file.*;


public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("E:\\Java\\Projects\\Udemy\\M");

        System.out.println("filePath.getFileName(): " + filePath.getFileName());
        System.out.println("directoryPath.getFileName(): " + directoryPath.getFileName());
        System.out.println("********************************************************************************************");

        System.out.println("filePath.getParent(): " + filePath.getParent());
        System.out.println("directoryPath.getParent(): " + directoryPath.getParent());
        System.out.println("********************************************************************************************");

        System.out.println("filePath.getRoot(): " + filePath.getRoot());
        System.out.println("directoryPath.getRoot(): " + directoryPath.getRoot());
        System.out.println("********************************************************************************************");

        System.out.println("filePath.toAbsolutePath().getParent(): " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolutePath().getRoot(): " + directoryPath.getRoot());
        System.out.println("********************************************************************************************");

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }
        System.out.println("********************************************************************************************");

        System.out.println("Files.isReadable(filePath):" + Files.isReadable(filePath));
        System.out.println("********************************************************************************************");


        System.out.println("********************************************************************************************");
    }
}





















































