package pl.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Spis ludności
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
      HashMap<String, String> dane = new HashMap<>() ;
      dane.put("kowalska", "kasia");
      dane.put("miskiewicz", "kasia");
      dane.put("mickiewicz", "adam");
      dane.put("Orus", "oleslaaw");
      dane.put("grabowska", "renia");
      dane.put("wodecki", "zbigniew");
      dane.put("budzinska", "dorotaa");
      dane.put("duda", "andrzej");
      dane.put("kaczyński", "lech");
      dane.put("fdsfd", "dsfd");
      //tutaj wpisz swój kod
return dane;
    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {
        int licznik =0;
        for (Map.Entry<String, String> imiona: map.entrySet()
              )
        if (imiona.getValue().equals(imie))
            licznik++;

        return licznik;
        }//tutaj wpisz swój kod



    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {
        int itContain =0;
        for (Map.Entry<String, String> nazwiska: map.entrySet()
             )
        if(nazwiska.getKey().equals(nazwisko))
        itContain++;
        return itContain;


    }

    public static void main(String[] args) {

    }
}
