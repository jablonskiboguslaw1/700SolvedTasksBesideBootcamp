package pl.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Usuń i wstaw
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner keyboard = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        strings.add(keyboard.nextLine());//tutaj wpisz swój kod
        strings.add(keyboard.nextLine());//tutaj wpisz swój kod
        strings.add(keyboard.nextLine());//tutaj wpisz swój kod
        strings.add(keyboard.nextLine());//tutaj wpisz swój kod
        strings.add(keyboard.nextLine());

        for (int i = 1; i <=13;i++){


        strings.add(0,strings.get(strings.size()-1));
            strings.remove(strings.size()-1);}

        for (String str: strings)
        System.out.println(str);

        //tutaj wpisz swój kod
    }
}
