package pl.codegym.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Identyczne wyrazy na liście
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> slowa = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            slowa.add(reader.readLine());
        }

        Map<String, Integer> mapa = liczSlowa(slowa);

        for (Map.Entry<String, Integer> para : mapa.entrySet()) {
            System.out.println(para.getKey() + " " + para.getValue());
        }
    }

    public static Map<String, Integer> liczSlowa(ArrayList<String> lista) {
        HashMap<String, Integer> wynik = new HashMap<String, Integer>();

        for (int i = 0; i < lista.size(); i++) {
            if(!( wynik.containsKey(lista.get(i))))
            wynik.put(lista.get(i),1);
        else wynik.put(lista.get(i),wynik.get(lista.get(i))+1);


        } //tutaj wpisz swój kod


        return wynik;
    }

}


