package pl.codegym.task.task03.task0319;

/* 
Prognozy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String imie = reader.readLine();
        String sliczba1 = reader.readLine();
        String sliczba2 = reader.readLine();
        int liczba1 = Integer.parseInt(sliczba1);
        int liczba2 = Integer.parseInt(sliczba2);

        System.out.println(imie+" dostanie "+liczba1+" za "+liczba2+" lat.");//tutaj wpisz swój kod
    }
}
