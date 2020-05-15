package pl.codegym.task.task04.task0420;

/* 
Sortowanie trzech liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();//tutaj wpisz swój kod
        int num2 = keyboard.nextInt();//tutaj wpisz swój kod
        int num3 = keyboard.nextInt();//tutaj wpisz swój kod

        if ((num1 <= num2) && (num2 <= num3))
            System.out.println(num3 + " " + num2 + " " + num1);
       else if ((num1 <= num2) && (num3 <= num1))
            System.out.println(num2 + " " + num1 + " " + num3);
        else if (num2 >= num1 && num1 <= num3)
            System.out.println(num2 + " " + num3 + " " + num1);
        else if (num2 <= num3 && num3 <= num1)
            System.out.println(num1 + " " + num3 + " " + num2);
        else  if (num1 <= num3 && num2 <= num1)
            System.out.println(num3 + " " + num1 + " " + num2);
        else  if (num1 >= num2 && num2 >= num3)
            System.out.println(num1 + " " + num2 + " " + num3);// tutaj wpisz swój kod
    }
}
