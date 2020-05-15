package pl.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Jedna wielka tablica i dwie małe
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        int [] bigArr = new int[20];
        for(int i = 0; i <bigArr.length;i++)
            bigArr[i] = keyboard.nextInt();

        int[] smallOne = new int[10];//tutaj wpisz swój kod
        int[] smallTwo = new int[10];
        for (int j=0; j<10;j++)
            smallOne[j]= bigArr[j];
        for (int j=0; j<10;j++){
            smallTwo[j]= bigArr[j+smallOne.length];
        System.out.println(smallTwo[j]);}


        //tutaj wpisz swój kod
    }
}
