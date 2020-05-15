package pl.codegym.task.task04.task0426;

/* 
Etykiety i liczby
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner keyboard = new Scanner(System.in);
       int a = keyboard.nextInt();

       if( a<0 && a%2==0)
           System.out.println("Ujemna liczba parzysta");
        else if( a<0 && a%2!=0)
            System.out.println("Ujemna liczba nieparzysta");
        else if( a>0 && a%2==0)
            System.out.println("Dodatnia liczba parzysta");
       else if( a>0 && a%2!=0)
            System.out.println("Dodatnia liczba nieparzysta");
        else
            System.out.println("Zero");//tutaj wpisz swój kod
    }
}
