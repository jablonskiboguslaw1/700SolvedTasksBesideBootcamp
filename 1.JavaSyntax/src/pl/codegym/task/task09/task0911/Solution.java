package pl.codegym.task.task09.task0911;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {

        try {
            //tutaj wpisz swój kod


            HashMap<String, String> mapa = new HashMap<String, String>(null);
            mapa.put(null, null);
            mapa.remove(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");//tutaj wpisz swój kod
        }
    }
}
