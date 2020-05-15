package com.codegym.task.task32.task3201;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;

/*
Writing to an existing file

*/
public class Solution {
    public static void main(String... args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
        raf.seek(Math.min(Long.parseLong(args[1]), raf.length()));
        raf.write(args[2].getBytes());
        raf.close();

    }
}
