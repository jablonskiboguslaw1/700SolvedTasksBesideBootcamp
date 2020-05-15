package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        int counter=0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

            while(fileInputStream.available()>0)
                if (fileInputStream.read()==44)
                    counter++;


        System.out.println(counter);
        fileInputStream.close();
    }
}
