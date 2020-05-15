package pl.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Mów zwięźle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new ArrayList<>();
        Scanner keyo = new Scanner(System.in);
        arr.add(keyo.nextLine());
        arr.add(keyo.nextLine());
        arr.add(keyo.nextLine());
        arr.add(keyo.nextLine());
        arr.add(keyo.nextLine());
        int min = arr.get(0).length();



        for (int i = 0; i < arr.size(); i++)

            if (arr.get(i).length() < min)
                min = arr.get(i).length();

        for (String str: arr)
            if (str.length()==min)
                System.out.println(str);
             {

        }

    }
}
