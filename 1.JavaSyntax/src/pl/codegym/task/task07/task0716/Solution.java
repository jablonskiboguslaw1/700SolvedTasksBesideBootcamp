package pl.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R czy L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("rosa"); // 0
        lista.add("luz"); // 1
        lista.add("lira"); // 2
        lista.add("dupa"); // 2
        lista.add("lina"); // 2
        lista.add("lampa"); // 2
        lista = napraw(lista);

        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> napraw(ArrayList<String> lista) {
        ArrayList<String> neOne = new ArrayList<>();


        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).contains("r") && lista.get(i).contains("l"))// tutaj wpisz swój kod
                neOne.add(lista.get(i));
            else if (lista.get(i).contains("r")){
                lista.remove(lista.get(i));
            i--;}
            else if (lista.get(i).contains("l")) {
                neOne.add(lista.get(i));
                neOne.add(lista.get(i));
            } else
                neOne.add(lista.get(i));
        }

        return neOne;
    }
}