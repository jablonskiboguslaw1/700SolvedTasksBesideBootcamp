package com.codegym.task.task31.task3101;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/*
Iterating through a file tree

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String path = args[0]; // path to the dir
        String resultFileAbsolutePath = args[1]; // full path of an existing file that will store the result
        File dir = new File(path);

        // rename resultFileAbsolutePath
        // for Class `File` under java.io.File `renameTo` might not succeed if a file with the destination
        // abstract pathname already exists. and this method is platform-dependent
        // Note that the `Files` class under java.nio.file
        // defines the move method to move or rename a file in a platform independent manner.
        // https://docs.oracle.com/javase/8/docs/api/java/io/File.html#renameTo-java.io.File-
        File beforeRename = new File(resultFileAbsolutePath);
        File afterRename = new File(beforeRename.getParent()+"\\allFilesContent.txt"); // Use "/" as the path separator. But we should "\\" !
        FileUtils.renameFile(beforeRename, afterRename);

        // get qualified files
        ArrayList<File> candidateFiles = new ArrayList<>();
//        recurSearchFiles(dir, candidateFiles);
        // this problem is requested to not use recursive way to iterate file tree
        // maintain a queue to store files and dir
        Queue<File> queue = new LinkedList<>();
        queue.add(dir);
        while(!queue.isEmpty()) {
            File curr = queue.poll();
            // get list of all files/dirs in curr
            File[] currFiles = curr.listFiles();
            if (currFiles != null){
                for (File f : currFiles){
                    if (f.isDirectory()){
                        queue.add(f);
                    }
                    // else f is a file
                    else{
                        if (f.isFile() && f.length() <= 50){
                            candidateFiles.add(new File(f.getAbsolutePath()));
                        }
                    }
                }
            }
        }

        //sort them by file name in ascending order
        Collections.sort(candidateFiles, new CompareFileName());

        // sequentially write contents of each file
        FileOutputStream fileOutputStream = new FileOutputStream(afterRename);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        BufferedReader reader = null;
        for (File f : candidateFiles) {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while (reader.ready()) {
                writer.write(reader.readLine());
                writer.flush();
            }
            writer.write("\n"); // After the body of each file, write "\n".
            reader.close();
        }

            writer.close();
            fileOutputStream.close();

    }

//    public static void recurSearchFiles(File currDir, ArrayList<File> files){
//        for (File f : currDir.listFiles()){
//            if (f.isDirectory()){
//                recurSearchFiles(f, files);
//            }
//            if (f.isFile() && f.length() <= 50){
//                files.add(f);
//            }
//        }
//    }

    // Comparator to compare file names
    static class CompareFileName implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            return ((File) o1).getName().compareTo(((File) o2).getName());
        }
    }
}