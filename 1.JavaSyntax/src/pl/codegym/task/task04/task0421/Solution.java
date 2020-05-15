package pl.codegym.task.task04.task0421;

/* 
Jola czy Jola?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String name1 = keyboard.nextLine();
        String name2 = keyboard.nextLine();
        if (name1.equals(name2))
            System.out.println("Imiona są identyczne");
        else if (name1.length() == name2.length())
            System.out.println("Imiona są takiej samej długości");
        //tutaj wpisz swój kod
    }
}
