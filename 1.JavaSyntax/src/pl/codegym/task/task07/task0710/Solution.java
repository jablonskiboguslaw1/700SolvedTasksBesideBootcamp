package pl.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Na szczycie listy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();//tutaj wpisz swój kod
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i <= 9; i++)
            strings.add(0, keyboard.nextLine());

        for (String str : strings)
        System.out.println(str);
             {

        }
    }
}
