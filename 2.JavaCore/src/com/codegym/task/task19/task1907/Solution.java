package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        reader.close();
        FileReader reader1 = new FileReader(input);
        StringBuilder builder = new StringBuilder();

        while (reader1.ready()) {
            builder.append((char)reader1.read());
        }
        String[] array = builder.toString().split("\\W");
        reader1.close();
        List<String> list = Arrays.asList(array);
        List<String> lista = list.stream().filter(str -> str.equals("world")).collect(Collectors.toList());
        int num = lista.size();
        System.out.println(num);
    }
}


