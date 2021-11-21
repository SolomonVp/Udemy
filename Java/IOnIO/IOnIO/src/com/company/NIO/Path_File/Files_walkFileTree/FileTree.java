package com.company.NIO.Path_File.Files_walkFileTree;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// Метод Files.walkFileTree(Path start, FileVisitor visitor) используется для обхода дерева файло.
// Логика обхода дерева файлов заключается в классе,, имплементирующем интерфейс FileVisitor.

// preVisitDirectory - срабатывает перед обращением к элементам папки.
// visitFile - срабатывает при обращении к файлу.
// postVisitDirectory - срабатывает после обращения ко всем элементам папки.
// visitFileFailed - срабатывает когда файл по каким-либо причинам недоступен.

// Значения FileVisitResult:
// CONTINUE - означает, что нужно продолжать обход по файлам.
// TERMINATE - означает, что нужно немедленно прекратить обход по файлам.
// SKIP_SUBTREE - означает, что в данную дир-ию заходить нельзя.
// SKIP_SIBLINGS - означает, что в данной дир-ии продолжать обход по файлам не нужно.

public class FileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\Java\\Projects\\Udemy\\X");
        Files.walkFileTree(path, new MyFileVisitor());
    }
}

class MyFileVisitor implements FileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }
}
