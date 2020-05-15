package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        BufferedReader reader = new BufferedReader(new FileReader(scanner.nextLine()));
        String[] doubles = reader.readLine().split(" ");
        List<Integer> integers = new ArrayList<>();
        for (String dou : doubles){
            integers.add((int) Math.round(Double.parseDouble(dou)));}


        PrintWriter printWriter = new PrintWriter(new FileWriter(scanner.nextLine()));
        for (Integer ints: integers)
            printWriter.print(ints+" ");
        reader.close();
        printWriter.close();
    }
}
