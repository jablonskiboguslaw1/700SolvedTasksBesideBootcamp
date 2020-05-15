package com.codegym.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Find all the files

*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> paths = new ArrayList<>();
        Queue<File> files = new LinkedList<>();
        File nodeFile = new File(root);
        files.add(nodeFile);
        while (!files.isEmpty()) {
            File current = files.poll();
            File[] listOfFilesAndDirs = current.listFiles();
            if (listOfFilesAndDirs != null) {
                for (File file : listOfFilesAndDirs) {
                    if (file.isDirectory()) {
                        files.add(file);
                    } else {
                       paths.add(file.getAbsolutePath());
                    }
                }

            }

        } return paths;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getFileTree("C:\\codegym\\CodeGymTasks\\2.JavaCore\\src\\pl\\codegym\\task\\task14\\task1405"));

    }
}