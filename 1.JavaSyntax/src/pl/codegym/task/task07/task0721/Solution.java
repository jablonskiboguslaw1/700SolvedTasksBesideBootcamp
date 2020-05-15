package pl.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Minimum i maksimum w tablicach
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int[] liczby = new int[20];
for (int i = 0; i <20;i++)
    liczby[i] = Integer.parseInt(reader.readLine());

        int maksimum= liczby[0];
        int minimum= liczby[0];

        for (int i = 0; i <liczby.length;i++){
            if (maksimum<liczby[i])
                maksimum=liczby[i];
        if (minimum > liczby[i])
            minimum= liczby[i];
        }
        //tutaj wpisz swój kod

        System.out.print(maksimum + " " + minimum);
    }
}
