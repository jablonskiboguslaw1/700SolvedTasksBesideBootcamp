package pl.codegym.task.task04.task0425;

/* 
Target niedostępny!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner keyboard = new Scanner(System.in) ;
       int a = keyboard.nextInt();//tutaj wpisz swój kod
       int b = keyboard.nextInt();

       if ( a<0 && b<0)
           System.out.println(3);
       if ( a>0 && b>0)
            System.out.println(1);
       if ( a>0 && b<0)
            System.out.println(4);
       if ( a<0 && b>0)
            System.out.println(2);///tutaj wpisz swój kod
    }
}
