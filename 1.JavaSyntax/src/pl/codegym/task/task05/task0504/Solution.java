package pl.codegym.task.task05.task0504;

/* 
Trzej Muszkoterowie
*/

public class Solution {
    public static void main(String[] args) {
       Kot kot1 = new Kot("felek", 4,5,3); //tutaj wpisz swój kod
       Kot kot2 = new Kot("felek2", 4,5,3); //tutaj wpisz swój kod
       Kot kot3 = new Kot("felek3", 4,5,3); //tutaj wpisz swój kod
    }

    public static class Kot {
        public String imie;
        protected int wiek;
        int waga;
        private int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }
    }
}