package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream stream = new FileInputStream(args[0]);
        int count = 0;
        while (stream.available() > 0) {
            if (Character.isAlphabetic(stream.read())) count++;

        }
        System.out.println(count);
        stream.close();
    }
}

