package pl.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Samotne tablice oddziałują na siebie
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++)
            str[i] = keyboard.nextLine();
        int[] arr = new int[10];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = str[j].length();
            System.out.println(arr[j]);
        }
    }
}
