package com.codegym.task.task18.task1802;

import java.io.*;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int temp;
        int min = inputStream.read();
        while (inputStream.available() > 0) {
            temp = inputStream.read();
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
        inputStream.close();


    }
}
