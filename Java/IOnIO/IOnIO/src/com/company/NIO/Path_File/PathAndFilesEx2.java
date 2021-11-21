package com.company.NIO.Path_File;

import java.io.IOException;
import java.nio.file.*;


public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("E:\\Java\\Projects\\Udemy\\M");
        Path directoryBPath = Paths.get("E:\\Java\\Projects\\Udemy\\B");

        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("test16.txt"));
        Files.copy(directoryBPath, directoryPath.resolve("B"));
        System.out.println("Done!");
    }
}
