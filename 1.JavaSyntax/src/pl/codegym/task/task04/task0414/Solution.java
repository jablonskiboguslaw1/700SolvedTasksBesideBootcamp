package pl.codegym.task.task04.task0414;

/* 
Liczba dni w roku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String sYear = reader.readLine();
       int year = Integer.parseInt(sYear);
       if ( (year%4!=0))
           System.out.println("Liczba dni w roku: 365");
         else  if (((year%100)==0)&&(year%400)!=0)
           System.out.println("Liczba dni w roku: 365");
         else System.out.println("Liczba dni w roku: 366");//tutaj wpisz swój kod
    }
}