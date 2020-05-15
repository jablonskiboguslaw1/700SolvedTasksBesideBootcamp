package pl.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Słowa na odwrót
*/

public class Solution {
    public static void main(String[] args) throws Exception {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>  arr = new ArrayList<>();
        arr.add(reader.readLine());//tutaj wpisz swój kod
        arr.add(reader.readLine());//tutaj wpisz swój kod
        arr.add(reader.readLine());//tutaj wpisz swój kod
        arr.add(reader.readLine());//tutaj wpisz swój kod
        arr.add(reader.readLine());//tutaj wpisz swój kod
        arr.remove(2);


        for (int i = arr.size()-1;i>=0;i--)
            System.out.println(arr.get(i));
              {

        }

    }
}


