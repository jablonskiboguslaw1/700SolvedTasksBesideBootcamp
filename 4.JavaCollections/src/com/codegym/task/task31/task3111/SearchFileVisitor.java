package com.codegym.task.task31.task3111;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize = -1;
    private int maxSize = -1;
    private List<Path> foundFiles = new ArrayList<>();

    public List<Path> getFoundFiles() {
        return foundFiles;
    }


    public String getPartOfName() {
        return partOfName;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public String getPartOfContent() {
        return partOfContent;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // File size: content.length
        boolean state = true;
        if (partOfContent != null && !isInside(file,partOfContent)) {
            state = false;
        }
        if (partOfName != null && !file.toString().contains(partOfName)) {
            state = false;
        }
        if (minSize > 0 && minSize > content.length) {
            state = false;
        }
        if (maxSize > 0 && maxSize < content.length) {
            state = false;
        }
        if (state) {
            foundFiles.add(file);
        }

        return super.visitFile(file, attrs);
    }


    private static boolean isInside(Path file, String partOfContent) throws FileNotFoundException {


        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.contains(partOfContent)) {
                    return true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}








