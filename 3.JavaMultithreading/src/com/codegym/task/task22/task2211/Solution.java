package com.codegym.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Changing the encoding

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        FileInputStream stream = new FileInputStream(file1);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        String buffer;
        while (reader.ready()) {
            buffer = reader.readLine();
            byte[] byteBuffer = buffer.getBytes("Windows-1251");
            String sUTF = new String(byteBuffer, StandardCharsets.UTF_8);
            writer.write(sUTF);
        }
        stream.close();
        writer.close();
    }
}
