package pl.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Odwróć tablicę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i<arr.length;i++)
            arr[i] = keyboard.nextInt();
        for (int i = arr.length-1; i>=0;i--)
            System.out.println(arr[i]);
    }
}

