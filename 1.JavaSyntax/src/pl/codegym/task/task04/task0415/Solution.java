package pl.codegym.task.task04.task0415;

/* 
Zasada trójkąta
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String sA= reader.readLine();//tutaj wpisz swój kod
      String sB= reader.readLine();//tutaj wpisz swój kod
      String sC= reader.readLine();
      int a = Integer.parseInt(sA);//tutaj wpisz swój kod
      int b= Integer.parseInt(sB);//tutaj wpisz swój kod
      int c = Integer.parseInt(sC);//tutaj wpisz swój kod

        if (!(a>=b+c|| b>=a+c||c>=a+b))
            System.out.println("Da się zbudować trójkąt.");
           else System.out.println("Nie da się zbudować trójkąta.");

    }
}