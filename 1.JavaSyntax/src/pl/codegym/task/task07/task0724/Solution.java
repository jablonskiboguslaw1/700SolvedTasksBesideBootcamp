package pl.codegym.task.task07.task0724;

/* 
Spis członków rodziny
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {

        Ludzie ludz1 = new Ludzie("Sierota1", true, 34);// tutaj wpisz swój kod
        Ludzie ludz2 = new Ludzie("Sierota2", false, 55);// tutaj wpisz swój kod
        Ludzie ludz3 = new Ludzie("Sierota3", false, 12);// tutaj wpisz swój kod
        Ludzie ludz4 = new Ludzie("Sierota4", true, 34);// tutaj wpisz swój kod
        Ludzie ludz5 = new Ludzie("Sierota4", true, 34, ludz1, ludz2);// tutaj wpisz swój kod
        Ludzie ludz6 = new Ludzie("Sierota4", true, 34, ludz1, ludz2);// tutaj wpisz swój kod
        Ludzie ludz7 = new Ludzie("Sierota4", true, 34, ludz1, ludz2);// tutaj wpisz swój kod
        Ludzie ludz8 = new Ludzie("Sierota4", true, 34, ludz1, ludz2);// tutaj wpisz swój kod
        Ludzie ludz9 = new Ludzie("Sierota4", true, 34, ludz1, ludz2);// tutaj wpisz swój kod

        System.out.println(ludz1.toString());
        System.out.println(ludz2.toString());
        System.out.println(ludz3.toString());
        System.out.println(ludz4.toString());
        System.out.println(ludz5.toString());
        System.out.println(ludz6.toString());
        System.out.println(ludz7.toString());
        System.out.println(ludz8.toString());
        System.out.println(ludz9.toString());

    }

    public static class Ludzie {
        String imie;
        boolean plec;
        int wiek;
        Ludzie ojciec;
        Ludzie matka;
        // tutaj wpisz swój kod


        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        public Ludzie(String imie, boolean plec, int wiek, Ludzie ojciec, Ludzie matka) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.ojciec = ojciec;
            this.matka = matka;
        }


        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null)
                tekst += ", ojciec: " + this.ojciec.imie;

            if (this.matka != null)
                tekst += ", matka: " + this.matka.imie;

            return tekst;
        }
    }
}