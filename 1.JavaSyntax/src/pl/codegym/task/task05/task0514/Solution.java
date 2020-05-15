package pl.codegym.task.task05.task0514;

/* 
I programista stworzył człowieka
*/

public class Solution {
    public static void main(String[] args) {
       Osoba osoba = new Osoba();
               osoba.inicjalizuj("zenek", 45); //tutaj wpisz swój kod
    }

    static class Osoba {
        private String imie;
        private int wiek;//tutaj wpisz swój kod


        public void inicjalizuj(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }
    }



}
