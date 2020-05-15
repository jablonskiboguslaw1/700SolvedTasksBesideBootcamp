package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        String str = scanner.nextLine();
        while (!str.equals("exit")) {
            strings.add(str);
            str = scanner.nextLine();
        }


        for (String string : strings) {
            try {
                    if((Integer.parseInt(string) <= 0) || (Integer.parseInt(string) >= 128))
                    print(Integer.parseInt(string));
                   else if((Integer.parseInt(string) > 0) || (Integer.parseInt(string) < 128))
                    print(Short.parseShort(string));
            } catch (Exception e) {
                try {
                    print(Double.parseDouble(string));
                } catch (Exception exception) {
                    print(string);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
