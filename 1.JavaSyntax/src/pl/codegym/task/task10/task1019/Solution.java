package pl.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
////////////// działa ale nie spełnia wymogów???.////
/* 
Funkcjonalność to nie wszystko!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> mapa = new HashMap<>();
        String imie;
        int id;
        do {
           id = Integer.parseInt(reader.readLine());
            imie = reader.readLine();

            mapa.put(imie, id);
        }

        while ((!imie.equals("")));


        for ( Map.Entry<String, Integer> str : mapa.entrySet())

            System.out.println(str.getValue() + " " + str.getKey());

    }
}
