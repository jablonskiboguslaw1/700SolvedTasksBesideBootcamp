package pl.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Tablica z ciągami w odwrotnej kolejności
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arr = new String [10];
        Scanner keyboard = new Scanner(System.in);
        for ( int i = 0;i <=7;i++)
            arr[i]= keyboard.nextLine();

        for (int j = 9;j>=0;j--)
            System.out.println(arr[j]);
    }
}