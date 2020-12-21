package com.codegym.task.task22.task2209;

import java.io.FileNotFoundException;

/*
Make a word chain

*/
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {





        // ...
      //  StringBuilder result = getLine();
      //  System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) throws FileNotFoundException {
       return null;
    }
    private static boolean isAfter(String a, String b){
        return b.charAt(0) == a.charAt(a.length() - 1);
    }
    private static boolean isBefore(String a, String b){
        return a.charAt(0) == b.charAt(b.length() - 1);
    }
}