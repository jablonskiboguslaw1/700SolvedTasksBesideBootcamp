package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.nextLine();
        String path2 = scanner.nextLine();
        FileInputStream fileInputStream1 = new FileInputStream(path1);
        byte[] buffer = new byte[fileInputStream1.available()];
        while (fileInputStream1.available() > 0) {
            int count = fileInputStream1.read(buffer);
        }
        fileInputStream1.close();

        FileOutputStream fileOutputStream = new FileOutputStream(path1);
        FileInputStream fileInputStream2 = new FileInputStream(path2);
        byte[] buffer2 = new byte[fileInputStream2.available()];
        while (fileInputStream2.available() > 0) {
            int count2 = fileInputStream2.read(buffer2);
        }

        fileOutputStream.write(buffer2);
        fileOutputStream.write(buffer);

        fileInputStream2.close();
        fileOutputStream.close();
    }
}

