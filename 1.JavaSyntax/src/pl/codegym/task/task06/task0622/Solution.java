package pl.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Liczby w kolejności rosnącej
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
for (int i =0; i <5; i++)
    arr[i]= Integer.parseInt(reader.readLine());

        Arrays.sort(arr);
        for (int j =0; j <arr.length; j++)
        System.out.println(arr[j]);
        //tutaj wpisz swój kod
    }
}
