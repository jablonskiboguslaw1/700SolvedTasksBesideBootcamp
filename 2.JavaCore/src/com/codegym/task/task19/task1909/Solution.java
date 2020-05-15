package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String output = reader.readLine();
        reader.close();

        BufferedReader inputReader = new BufferedReader(new FileReader(input));
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter(output));
        StringBuilder builder = new StringBuilder();
        while (inputReader.ready()) {
            builder.append(inputReader.readLine());
        }
        inputReader.close();

        outputWriter.write(builder.toString().replaceAll("\\.", "!"));
        outputWriter.close();


    }
}
