package pl.codegym.task.task04.task0428;

/* 
Liczba dodatnia
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();//tutaj wpisz swój kod
        int b = keyboard.nextInt();//tutaj wpisz swój kod
        int c = keyboard.nextInt();//tutaj wpisz swój kod
        if (a > 0 && b > 0 && c > 0)
            System.out.println(3);
        else if ((a > 0 && b > 0) || (a > 0 && c > 0) || (c > 0 && b > 0))
            System.out.println(2);
        else if (a > 0 || b > 0 || c > 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
