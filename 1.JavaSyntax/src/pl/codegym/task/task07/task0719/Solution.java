package pl.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Wyświetl liczby w odwrotnej kolejności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
ArrayList<Integer> inty = new ArrayList<>();
for (int i = 0; i<10;i++)
    inty.add(Integer.parseInt(reader.readLine()));

for (int j= inty.size()-1; j>=0;j--)
    System.out.println(inty.get(j));
        //tutaj wpisz swój kod
    }
}
