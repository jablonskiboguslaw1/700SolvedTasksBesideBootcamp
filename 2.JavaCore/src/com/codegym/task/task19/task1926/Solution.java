package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // String path = "C:\\Users\\Bogus\\Desktop\\2.txt";
        String path = reader.readLine();
        reader.close();
        FileReader reader1 = new FileReader(path);
        BufferedReader reader2 = new BufferedReader(reader1);
        StringBuffer buffer= new StringBuffer();
        while (reader2.ready()){
            System.out.println(buffer.append(reader2.readLine()).reverse());
            buffer.setLength(0);}
        reader1.close();
        reader2.close();



    }
}
