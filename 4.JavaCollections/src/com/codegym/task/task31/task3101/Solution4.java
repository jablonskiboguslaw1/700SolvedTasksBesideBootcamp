package com.codegym.task.task31.task3101;


import java.io.*;

import java.nio.file.Files;
import java.util.*;

/*
Iterating through a file tree

*/
public class Solution4 {
    public static void main(String[] args) throws IOException {
        // String path1 = "C:\\Users\\Bogus\\Desktop\\testy";
        // String path2 = "C:\\Users\\Bogus\\Desktop\\noname.txt";

//making files from paths
        File folder = new File(args[0]);
        // File folder = new File(path1);
        File outputFile = new File(args[1]);
        //  File outputFile = new File(path2);

//List of files NOT greater than 50bytes
        List<File> smallFiles = new ArrayList<>();
        Queue<File> queue = new LinkedList<>();
        File current = null;
        queue.add(folder);
        while (!queue.isEmpty()) {
            current = queue.poll();
            File[] temp = current.listFiles();
            if (temp != null) {
                for (File file : temp) {
                    if (file.isDirectory()) {
                        queue.add(file);
                    } else if ((file.isFile() && file.length() <= 50)) {
                        smallFiles.add(file);
                    }
                }
            }
        }
        //list sorting
        //smallFiles.sort(Comparator.comparing(File::getName));
        Collections.sort(smallFiles);

        for (File file : smallFiles) {
            System.out.println(file);
        }
        //file Rename
        File afterRename = new File(outputFile.getParent() + "\\allFilesContent.txt");
        FileUtils.renameFile(outputFile, afterRename);
        afterRename.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(afterRename);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        BufferedReader reader = null;
        for (File f : smallFiles){
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while(reader.ready()){
                writer.write(reader.readLine());
                writer.flush();
            }
            reader.close();
            writer.write("\n"); // After the body of each file, write "\n".
        }
        writer.close();
        fileOutputStream.close();
    }
       /* BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(afterRename, true)));
        for (File f : smallFiles) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while (reader.ready()) {
                writer.write(reader.readLine());
                writer.flush();
            }
            reader.close();
            writer.write('\n');
        }
        writer.close();*/
    }









