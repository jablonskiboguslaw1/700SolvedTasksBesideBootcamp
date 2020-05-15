package pl.codegym.task.task05.task0532;

import java.io.*;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a =Integer.parseInt(reader.readLine())-1;
        int b;
        int maksimum=Integer.parseInt(reader.readLine());
        for (int i=1;i<=a;i++){
            b=Integer.parseInt(reader.readLine());
            if (maksimum<b)
                maksimum=b;}


         ;

        //tutaj wpisz swój kod

        System.out.println(maksimum);
    }
}
