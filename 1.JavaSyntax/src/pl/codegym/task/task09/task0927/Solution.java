package pl.codegym.task.task09.task0927;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Dziesięć kotów
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Kot> mapa = utworzMap();
        Set<Kot> set = konwertujMapDoSet(mapa);
        printSetKotow(set);
    }

    public static Map<String, Kot> utworzMap() {
        HashMap<String, Kot> koty = new HashMap<>();
                koty.put("kot1", new Kot("kot1"));//tutaj wpisz swój kod
                koty.put("kot2", new Kot("kot2"));//tutaj wpisz swój kod
                koty.put("kot3", new Kot("kot3"));//tutaj wpisz swój kod
                koty.put("kot4", new Kot("kot4"));//tutaj wpisz swój kod
                koty.put("kot5", new Kot("kot5"));//tutaj wpisz swój kod
                koty.put("kot6", new Kot("kot6"));//tutaj wpisz swój kod
                koty.put("kot7", new Kot("kot7"));//tutaj wpisz swój kod
                koty.put("kot8", new Kot("kot8"));//tutaj wpisz swój kod
                koty.put("kot9", new Kot("kot9"));//tutaj wpisz swój kod
                koty.put("kot10", new Kot("kot10"));//tutaj wpisz swój kod
   return koty;
    }

    public static Set<Kot> konwertujMapDoSet(Map<String, Kot> mapa) {
       Set<Kot> koty = new HashSet<>(mapa.values());
       return koty;//tutaj wpisz swój kod
    }

    public static void printSetKotow(Set<Kot> set) {
        for (Kot kot : set) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        public String toString() {
            return "Kot " + this.imie;
        }
    }


}
