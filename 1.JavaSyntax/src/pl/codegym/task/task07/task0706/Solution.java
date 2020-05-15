package pl.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Ulice i domy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int[] numery= new int[15];
        int nieparzyste=0;
        int parzyste = 0;
        for (int i = 0; i< numery.length;i++){
            numery[i] = keyboard.nextInt();
        if (i%2==0)
            parzyste+=numery[i];
        else nieparzyste+=numery[i];}
         if (nieparzyste>parzyste)
             System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");
         else System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");

        //tutaj wpisz swój kod
    }
}
