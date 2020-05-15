package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
           String path = args[0];
       // String path = "C:\\Users\\Bogus\\Desktop\\1.txt";
          String path2 = args[1];
       // String path2 = "C:\\Users\\Bogus\\Desktop\\2.txt";
        FileReader reader = new FileReader(path);
        BufferedReader reader1 = new BufferedReader(reader);
        FileWriter writer = new FileWriter(path2);
        BufferedWriter writer1 = new BufferedWriter(writer);
        String[] str;
        StringBuffer buffer = new StringBuffer();
        while (reader1.ready()) {
            str = reader1.readLine().split(" ");
            for (String s : str)
                if (s.length() > 6)
                    buffer.append(s).append(",");
        }
buffer.deleteCharAt(buffer.length()-1);
        writer1.write(buffer.toString());
        reader1.close();

        writer1.close();
        reader.close();
        writer.close();


    }
}
