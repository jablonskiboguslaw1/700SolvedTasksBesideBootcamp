package pl.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {

            HashMap<String, String> mapa = new HashMap();
            mapa.put("Kowalska","Kasia");//tutaj wpisz swój kod
            mapa.put("Dobrowolska","Marta");//tutaj wpisz swój kod
            mapa.put("Dobrowolski","Piotr");//tutaj wpisz swój kod
            mapa.put("Szczes","Adam");//tutaj wpisz swój kod
            mapa.put("Małysz","Adam");//tutaj wpisz swój kod
            mapa.put("Paszkiewicz","Pawel");//tutaj wpisz swój kod
            mapa.put("Salata","Piotr");//tutaj wpisz swój kod
            mapa.put("Kowalski","Jan");//tutaj wpisz swój kod
            mapa.put("Nowak","Kasia");//tutaj wpisz swój kod
            mapa.put("Suwak","Kasia");//tutaj wpisz swój kod
            return mapa;
        //tutaj wpisz swój kod

    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        ArrayList<String> listadoub= new ArrayList<>();


        //tutaj wpisz swój kod

    }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc))
                mapa.remove(para.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
