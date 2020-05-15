package pl.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Tylko dla bogaczy
*/

public class Solution {
    public static HashMap<String, Integer> utworzMap() {
       HashMap<String, Integer> mapa = new HashMap<>() ;
       mapa.put("Leszczek", 2900);//tutaj wpisz swój kod
       mapa.put("Leszcz", 490);//tutaj wpisz swój kod
       mapa.put("piotr", 300);//tutaj wpisz swój kod
       mapa.put("korol", 290);//tutaj wpisz swój kod
       mapa.put("lele", 900);//tutaj wpisz swój kod
       mapa.put("Leszczek3", 2900);//tutaj wpisz swój kod
       mapa.put("Leszczek4", 900);//tutaj wpisz swój kod
       mapa.put("Leszczek5", 200);//tutaj wpisz swój kod
       mapa.put("Leszczek6", 100);//tutaj wpisz swój kod
       mapa.put("Leszczek7", 500);//tutaj wpisz swój kod
        return  mapa;
    }

    public static void usunPozycjeZmap(HashMap<String, Integer> map) {
       // for (Map.Entry<String,Integer> entry: map.entrySet())
map.entrySet().removeIf(next->next.getValue()<500);
              {

        }//tutaj wpisz swój kod
    }

    public static void main(String[] args) {
     /*  HashMap sfsd = utworzMap();
        for (Object entry : sfsd.entrySet())
            System.out.println(entry.toString());

        usunPozycjeZmap(sfsd);
        System.out.println();

        for (Object entry : sfsd.entrySet())
            System.out.println(entry.toString());

*/
        }
    }
