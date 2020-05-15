package com.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();
static {
    File myfile = new File(Statics.FILE_NAME);
    try {
        Scanner input = new Scanner(myfile);
        while (input.hasNextLine())
                lines.add(input.nextLine());
        input.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
