package pl.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Najkrótszy czy najdłuższy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();//tutaj wpisz swój kod
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i <= 9; i++)
            strings.add(keyboard.nextLine());


        //tutaj wpisz swój kod
        int min = strings.get(0).length();
        int firstMin = 0;
        int firstMax = 0;
        for (int i = 0; i < strings.size(); i++)

            if (strings.get(i).length() < min) {
                min = strings.get(i).length();
                firstMin = i;
            }
        int max = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++)

            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
                firstMax = i;
            }
        if (firstMax < firstMin)
            System.out.println(strings.get(firstMax));
        else System.out.println(strings.get(firstMin));
    }


}
