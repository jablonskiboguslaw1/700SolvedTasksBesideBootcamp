package pl.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* 
Koci Set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();

        //tutaj wpisz swój kod. krok 3

        printKoty(koty);
    }

    public static Set<Kot> utworzKoty() {
        Set<Kot> koty = new LinkedHashSet<>();
        koty.add(new Kot());
        koty.add(new Kot());
        koty.add(new Kot());
        //tutaj wpisz swój kod. krok 2
        return koty;
    }

    public static void printKoty(Set<Kot> koty) {
        for (Kot kot : koty)
            System.out.println(kot);


        // krok 4
    }

    public static class Kot{

    }// krok 1
}
