package pl.codegym.task.task09.task0926;


import java.util.ArrayList;

/*
Lista tablic z liczbami
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> lista = utworzLista();
        printLista(lista);
    }

    public static ArrayList<int[]> utworzLista() {
      ArrayList<int[]> tablice = new ArrayList<>() ;
      tablice.add(new int[]{2,5,6,4,1});
      tablice.add(new int[]{6,4});
      tablice.add(new int[]{2,5,4,1});
      tablice.add(new int[]{2,5,6,4,1,8,9});
      tablice.add(new int[]{});
     return tablice; //tutaj wpisz swój kod
    }

    public static void printLista(ArrayList<int[]> lista) {
        for (int[] tablica : lista) {
            for (int x : tablica) {
                System.out.println(x);
            }
        }
    }
}
