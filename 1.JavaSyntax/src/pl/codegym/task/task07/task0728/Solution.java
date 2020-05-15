package pl.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
W kolejności malejącej
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[20];
        for (int i = 0; i < 20; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sort(tablica);

        for (int x : tablica) {
            System.out.println(x);
        }
    }

    public static void sort(int[] tablica) throws InterruptedException {


            Arrays.sort(tablica);

               int temp;
            for (int k=0; k<tablica.length/2;k++){
                temp= tablica[k];
                tablica[k]= tablica[tablica.length-1-k];
            tablica[tablica.length-1-k]=temp;



        //tutaj wpisz swój kod
    }
}}
