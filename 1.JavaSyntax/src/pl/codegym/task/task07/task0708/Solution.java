package pl.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Najdłuższy ciąg
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        Scanner keyo = new Scanner(System.in);
        strings.add(keyo.nextLine());
        strings.add(keyo.nextLine());
        strings.add(keyo.nextLine());
        strings.add(keyo.nextLine());
        strings.add(keyo.nextLine());
        int min = strings.get(0).length();



        for (int i = 0; i < strings.size(); i++)

            if (strings.get(i).length() > min)
                min = strings.get(i).length();

        for (String str: strings)
            if (str.length()==min)
                System.out.println(str);
        {

        }

    } //tutaj wpisz swój kod
    }

