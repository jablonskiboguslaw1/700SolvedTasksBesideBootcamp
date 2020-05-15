package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();//tutaj wpisz swój kod
        int num2 = keyboard.nextInt();//tutaj wpisz swój kod
        int num3 = keyboard.nextInt();//tutaj wpisz swój kod
        int a = 0;
        int b  =0;
        if (num1 > 0)
            a++;
        if (num2> 0)
            a++;
        if (num3 > 0)
            a++;
        if (num1 < 0)
            b++;
        if (num2 < 0)
            b++;
        if (num3 < 0)
            b++;
        System.out.println("Liczba liczb ujemnych: "+b);
        System.out.println("Liczba liczb dodatnich: "+a );
    }
}
