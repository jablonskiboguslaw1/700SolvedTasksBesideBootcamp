package pl.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Więcej Ala ma kota
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<String> lista = new ArrayList<>() ;
       lista.add("Ala");//tutaj wpisz swój kod
       lista.add("ma");//tutaj wpisz swój kod
       lista.add("kota");//tutaj wpisz swój kod

        for (int i =0; i<lista.size();i+=2)
            lista.add(i+1,"As");

        for (String str :lista)
            System.out.println(str);


        }
    }

