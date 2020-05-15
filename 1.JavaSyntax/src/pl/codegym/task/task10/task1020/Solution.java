package pl.codegym.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[30];
        for (int i = 0; i < 30; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sort(tablica);

        System.out.println(tablica[9]);
        System.out.println(tablica[10]);
    }

    public static void sort(int[] tablica) {
        Arrays.sort(tablica);//tutaj wpisz swój kod
    }
}
