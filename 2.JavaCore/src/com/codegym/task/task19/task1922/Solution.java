package com.codegym.task.task19.task1922;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) throws IOException {


        List<String[]> lista = getList();



        int counter = 0;

        for (String[] strTab : lista) {
            for (String str : strTab) {
                if (words.contains(str))
                    counter++;
            }
            if (counter == 2){
                for (String stri: strTab)
                    System.out.print(stri+" ");
            System.out.println();}
            counter=0;
        }
    }


    private static List<String[]> getList() throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file = read.readLine();
        read.close();
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);


        List<String[]> strings = new ArrayList<>();

        while (reader.ready()) {
            strings.add(reader.readLine().split(" "));
        }
        fileReader.close();

        reader.close();

        return strings;
    }

}
