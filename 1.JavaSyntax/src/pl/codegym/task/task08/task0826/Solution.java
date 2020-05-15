package pl.codegym.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Pięciu wygranych
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[20];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sort(tablica);

        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);
        System.out.println(tablica[3]);
        System.out.println(tablica[4]);
    }

    public static void sort(int[] tablica) {
        Arrays.sort(tablica);
        int temp;
        for (int k=0; k<tablica.length/2;k++){
            temp= tablica[k];
            tablica[k]= tablica[tablica.length-1-k];
            tablica[tablica.length-1-k]=temp;
    }
}}
