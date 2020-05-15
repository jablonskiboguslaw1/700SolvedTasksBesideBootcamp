package pl.codegym.task.task04.task0419;

/* 
Największa z czterech liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
     Scanner keyboard = new Scanner(System.in) ;
     int num1 = keyboard.nextInt();//tutaj wpisz swój kod
     int num2 = keyboard.nextInt();//tutaj wpisz swój kod
     int num3 = keyboard.nextInt();//tutaj wpisz swój kod
     int num4 = keyboard.nextInt();
     if ((num1>=num2)&&(num1>=num3)&&(num1>=num4))
         System.out.println(num1);
     else if ((num2>=num1)&&(num2>=num3)&&(num2>=num4))
         System.out.println(num2);
     else if ((num3>=num1)&&(num3>=num3)&&(num3>=num4))
         System.out.println(num3);
     else if ((num4>=num1)&&(num4>=num3)&&(num4>=num2))
         System.out.println(num4);//tutaj wpisz swój kod
    }
}
