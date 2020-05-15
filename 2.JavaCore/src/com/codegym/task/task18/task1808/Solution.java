package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream out1 = new FileOutputStream(reader.readLine());
        FileOutputStream out2 = new FileOutputStream(reader.readLine());
        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            int count = inputStream.read(buffer);
        }

        byte[] mid1= new byte[buffer.length-buffer.length/2];
        byte[] mid2 = new byte[buffer.length-mid1.length];

        for (int i =0; i <mid1.length;i++){
            mid1[i]= buffer[i];}

        for (int j = 0; j <mid2.length ; j++) {
            mid2[j]=buffer[buffer.length-mid2.length+j];
        }

        out1.write(mid1, 0, mid1.length);
        out2.write(mid2, 0, mid2.length);

        inputStream.close();
        out1.close();
        out2.close();

    }
}

