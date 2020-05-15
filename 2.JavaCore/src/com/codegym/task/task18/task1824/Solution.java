package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream stream;
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while (true) {
            try {
                input = scanner.nextLine();
                stream = new FileInputStream(input);

            } catch (FileNotFoundException e) {
                System.out.println(input);
                break;
            }
            stream.close();
        }
    }
}
