package pl.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Aktualizacja oprogramowania
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lista adresów
        List<String> adresy = new ArrayList<>();

        while (true) {
            String rodzina = reader.readLine();
            if (rodzina.isEmpty()) break;
            String miasto = reader.readLine();
            adresy.add(rodzina);
            adresy.add(miasto);
        }

        // Wczytuje numer domu
        String wprowadzoneMiasto = reader.readLine();
for (int i=0;i<adresy.size()-1;i++){
        if (wprowadzoneMiasto!=null) {
            if (adresy.get(i).equals(wprowadzoneMiasto))
                System.out.println(adresy.get(i+1));


        }/*
            String nazwiskoRodziny = adresy.get(wprowadzoneMiasto);
            System.out.println(nazwiskoRodziny);*/
        }
    }
}
