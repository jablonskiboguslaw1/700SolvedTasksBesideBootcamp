package pl.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Przestawiono w samą porę
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++)
            lista.add(reader.readLine());


        for (int x =0;x<m;x++)
            lista.add(lista.get(x));

        for (int j = m - 1; j >= 0; j--) {

            lista.remove(j);}

            for (int k = 0; k < lista.size(); k++)
                System.out.println(lista.get(k));

            //tutaj wpisz swój kod
        }
    }

