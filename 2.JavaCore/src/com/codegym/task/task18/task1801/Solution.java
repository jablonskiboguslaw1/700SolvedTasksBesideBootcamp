package com.codegym.task.task18.task1801;

import java.io.*;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int max = fileInputStream.read();
        int temp;
        while (fileInputStream.available() > 0) {
            temp = fileInputStream.read();
            if (temp > max) {
                max = temp;
            }

        }
        System.out.println(max);
        fileInputStream.close();
    }
}

