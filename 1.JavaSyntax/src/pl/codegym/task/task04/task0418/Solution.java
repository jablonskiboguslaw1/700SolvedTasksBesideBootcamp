package pl.codegym.task.task04.task0418;

/* 
Mniejsza z dwóch liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        if (num1 > num2) System.out.println(num2);
        else if (num1 < num2) System.out.println(num1);
        else System.out.println(num1);
        ;//tutaj wpisz swój kod
    }
}