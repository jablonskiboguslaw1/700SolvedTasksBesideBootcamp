package pl.codegym.task.task05.task0530;

import java.io.*;

/* 
Szefie, mam tu coś dziwnego...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);

        int suma = a + b;
        System.out.println("Suma = " + suma);
    }
}
