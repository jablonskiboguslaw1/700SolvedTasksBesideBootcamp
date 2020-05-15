package pl.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Granie w Javarellę
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        Scanner key = new Scanner(System.in);

        ArrayList<Integer> glowna = new ArrayList<>();//tutaj wpisz swój kod
        ArrayList<Integer> po3 = new ArrayList<>();//tutaj wpisz swój kod
        ArrayList<Integer> po2 = new ArrayList<>();//tutaj wpisz swój kod
        ArrayList<Integer> reszta = new ArrayList<>();//tutaj wpisz swój kod

        for (int i = 0; i < 20; i++)
            glowna.add(key.nextInt());

        for (int i = 0; i < glowna.size(); i++)
            if (glowna.get(i) % 3 == 0 && glowna.get(i) % 2 == 0) {
                po3.add(glowna.get(i));
                po2.add(glowna.get(i));
            } else if (glowna.get(i) % 3 == 0)
                po3.add(glowna.get(i));
            else if (glowna.get(i) % 2 == 0)
                po2.add(glowna.get(i));
            else reszta.add(glowna.get(i));


            printLista(po3);
            printLista(po2);
            printLista(reszta);
    }

    public static void printLista(List<Integer> lista) {
        for (Integer intus : lista)
            System.out.println(intus);
              {

        } //tutaj wpisz swój kod
    }
}
