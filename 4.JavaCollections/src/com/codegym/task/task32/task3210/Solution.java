package com.codegym.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

/* 
Using RandomAccessFile

*/

public class Solution {
    public static void main(String... args) throws IOException {
        String path = args[0];
        int position = Integer.parseInt(args[1]);
        String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(path, "rw");
        byte[] arr = new byte[args[2].getBytes().length];

        try {
            raf.seek(position);
            raf.read(arr, 0, arr.length);

            raf.seek(raf.length());
String one = new String(arr);
            if(text.compareTo(one)==0){
                raf.write("true".getBytes());}
            else
                raf.write("false".getBytes());
            raf.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}