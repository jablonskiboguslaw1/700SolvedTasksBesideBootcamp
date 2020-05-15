package pl.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Współdzielone nazwiska i imiona
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> mapa = utworzListLudzi();
        printListLudzi(mapa);
    }

    public static Map<String, String> utworzListLudzi() {
        Map<String, String> dane = new HashMap<>() ;
        dane.put("kowalska", "kasia");
        dane.put("miskiewicz", "kasia");
        dane.put("miskiewicz", "adam");
        dane.put("Orus", "oleslaaw");
        dane.put("grabowska", "renia");
        dane.put("wodecki", "zbigniew");
        dane.put("budzinska", "dorotaa");
        dane.put("duda", "andrzej");
        dane.put("kaczyński", "lech");
        dane.put("fdsfd", "dsfd");//tutaj wpisz swój kod

        return dane;
    }

    public static void printListLudzi(Map<String, String> mapa) {
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
