package pl.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Tablica z listami ciągów
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] tablicaCiagowList = utworzList();
        printList(tablicaCiagowList);
    }

    public static ArrayList<String>[] utworzList() {
        ArrayList<String>[] lista = new ArrayList[2];
        lista[0] = new ArrayList<String>();
        lista[0].add(0,"sfdd");
        lista[0].add(1,"sd");
        lista[0].add(2,"sfd");
        lista[1] = new ArrayList<String>();
        lista[1].add(0,"sfdd");
        lista[1].add(1,"dd");
        lista[1].add(2,"sfd");

        return lista;
    }

    public static void printList(ArrayList<String>[] tablicaCiagowList) {
        for (ArrayList<String> lista : tablicaCiagowList) {
            for (String s : lista) {
                System.out.println(s);
            }
        }
    }
}