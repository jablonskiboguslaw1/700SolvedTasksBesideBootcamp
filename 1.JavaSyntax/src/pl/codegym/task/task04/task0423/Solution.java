package pl.codegym.task.task04.task0423;

/* 
Strategia ochroniarzy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imie = reader.readLine();
       String sage = reader.readLine();
       int age = Integer.parseInt(sage);
       if (age>20)
           System.out.println("Wystarczy, że masz 18");//tutaj wpisz swój kod
    }
}
