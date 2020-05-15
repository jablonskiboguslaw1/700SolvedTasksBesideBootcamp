package pl.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Liczba liter
////////////////to jest rozwiązane ale nie działa///////////////
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alfabet
        String abc = "aąbcćdeęfghijklłmnńoóprsśtuwyzźż";
        char[] abcTablica = abc.toCharArray();

        ArrayList<Character> alfabet = new ArrayList<>();
        for (char litera : abcTablica) {
            alfabet.add(litera);
        }

        // Czyta ciągi
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s.toLowerCase());
        }
        String strall = "";
        for (String str : lista)
            strall += str;

       char [] znaki = strall.toCharArray();
        LinkedHashMap<Character, Integer> mapa = new LinkedHashMap<>();

        for (Character znak: alfabet) {
            mapa.put(znak, 0);
            int temp = 0;
            for (Character nap : znaki)
                if (znak == nap) {
                    temp++;
                    mapa.put(znak, temp);
                }
        }

        for (Map.Entry<Character,Integer> dsfd : mapa.entrySet())
            System.out.println(dsfd.getKey()+ " "+dsfd.getValue());

        }


    }




