package com.codegym.task.task31.task3101;

import java.io.File;
import java.io.IOException;

public class FileTest {

    private static final String  URL = "C:\\Users\\Bogus\\Desktop\\testowyFile.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(URL);
        File file2 = new File("C:\\Users\\Bogus\\Desktop\\t.txt");
      //  file2.createNewFile();

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getName());
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getTotalSpace());
        System.out.println(file.length());
       FileUtils.renameFile(file,new File(file.getParent()+"\\niema.txt"));
    }
}
