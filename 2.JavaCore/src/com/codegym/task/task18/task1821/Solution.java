package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream reader = new FileInputStream(args[0]);

        int[] list = new int[256];

        int actual;
        while (reader.available() > 0) {
            actual = reader.read();
            list[actual]++;
        }

        for (int i = 0; i < list.length; i++) {
            if(list[i]!=0)
            System.out.println((char) i + " " + list[i]);

            reader.close();
        }
    }
}


