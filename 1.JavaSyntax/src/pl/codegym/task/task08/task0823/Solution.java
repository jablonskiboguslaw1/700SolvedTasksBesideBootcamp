package pl.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Ruszamy na cały kraj
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.trim();
        ArrayList<String> lista = new ArrayList<>();
        Collections.addAll(lista, s.split("\\s+"));



            for (String str : lista)
            System.out.print(str.toUpperCase().charAt(0)+str.substring(1)+" ");

        //tutaj wpisz swój kod
    }
}
