package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());

        int counterSign = 0;
        while (fileReader.ready()) {
            counterSign++;
            int input = fileReader.read();
            if (counterSign % 2 == 0)
                fileWriter.write(input);
        }
        fileReader.close();
        fileWriter.close();
        reader.close();


    }
}
