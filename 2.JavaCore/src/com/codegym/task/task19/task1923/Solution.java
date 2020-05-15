package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fileReader);
        String[] tmp;
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        while (reader.ready()) {
            tmp = reader.readLine().split(" ");
            for (String str : tmp) {
                if (str.matches(".*\\d.*"))
                    writer.write(str+" ");
            }
        }reader.close();
        fileReader.close();
        writer.close();

    }
}

