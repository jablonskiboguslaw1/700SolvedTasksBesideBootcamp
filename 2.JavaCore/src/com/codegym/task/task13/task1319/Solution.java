package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file= new File(reader.readLine());
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        String tmp;
        do{
            tmp= reader.readLine();
        writer.write(tmp+"\r\n");}
        while(!tmp.equals("exit"));


    reader.close();
    writer.close();



    }
}
