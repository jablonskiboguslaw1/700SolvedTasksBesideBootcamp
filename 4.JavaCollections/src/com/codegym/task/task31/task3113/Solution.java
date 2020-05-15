package com.codegym.task.task31.task3113;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;


/* 
What's in the folder?

*/
public class Solution {

    static long totalFolders = 0-1;
    // (-1)because without start folder
    static long totalFiles = 0;
    static long totalBytes = 0;


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filePath = reader.readLine();
        reader.close();

        Path startFile = Paths.get(filePath);

        if (!Files.isDirectory(startFile)) {
            System.out.println(startFile.toAbsolutePath().toString() + " is not a folder");
            return;
        }

        Files.walkFileTree(startFile, new Visitor());

        System.out.println("Total folders: " + totalFolders);
        System.out.println("Total files: " + totalFiles);
        System.out.println("Total size: " + totalBytes);

    }

    public static class Visitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

                totalFolders++;

            return CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            if (attrs.isRegularFile()) {
                totalFiles++;
                totalBytes += attrs.size();
            }


            return CONTINUE;

        }
    }
}
