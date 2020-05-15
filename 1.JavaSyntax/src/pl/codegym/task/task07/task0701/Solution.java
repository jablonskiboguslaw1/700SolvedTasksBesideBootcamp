package pl.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Maksimum w tablicy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] tablica = inicjalizujTablice();
        int max = max(tablica);
        System.out.println(max);
    }

    public static int[] inicjalizujTablice() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = keyboard.nextInt();
        // Tworzy i zapełnia tablicę
        return arr;
    }

    public static int max(int[] tablica) {

        int max = (tablica[0] > tablica[1])? tablica[0] : tablica[1];
        for (int i =1; i<tablica.length;i++)
            if (tablica[i]>max)
                max= tablica[i];

        return max;
    }
}

