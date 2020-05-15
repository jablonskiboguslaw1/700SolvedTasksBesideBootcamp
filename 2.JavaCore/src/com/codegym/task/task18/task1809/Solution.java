package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[fileInputStream.available()];

        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read(buffer);
        }
        for (int i = 0; i < buffer.length / 2; i++) {
            byte temp = buffer[i];
            buffer[i] = buffer[buffer.length - i - 1];
            buffer[buffer.length - i - 1] = temp;
        }
        fileOutputStream.write(buffer, 0, buffer.length);

        fileInputStream.close();
        fileOutputStream.close();


    }
}
