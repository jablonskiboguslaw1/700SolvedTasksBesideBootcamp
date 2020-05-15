package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        List<Character> chaV = new ArrayList<>();
        List<Character> chaC = new ArrayList<>();
        for (char a : chars) {
            if (isVowel(a)) {
                chaV.add(a);
            } else
                if (a!=' ')
                    chaC.add(a);

        }
        for (char v : chaV)
            System.out.print(v + " ");
        System.out.println();
        for (char c : chaC)
            System.out.print(c + " ");
         // write your code here
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}