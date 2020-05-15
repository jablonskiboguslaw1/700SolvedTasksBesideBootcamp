package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Duplikowanie słów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner key = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            lista.add(key.nextLine());// Czyta ciągi z konsoli i deklaruje tutaj ArrayList

        ArrayList<String> wynik = doubleValues(lista);

        for (String str : wynik)
            System.out.println(str);


}

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {
        for ( int i =0; i<lista.size();i+=2)
            lista.add(i,lista.get(i));//tutaj wpisz swój kod
        return lista;
    }
}
