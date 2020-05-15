package pl.codegym.task.task10.task1013;

/* 
Konstruktory klasy Ludzie
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Ludzie {
        private int wiek;
        private String imie;
        private String nazwisko;
        private int wzrost;
        private boolean plec;
        private String narodowość;

        public Ludzie(int wiek) {
            this.wiek = wiek;
        }

        public Ludzie(String imie) {
            this.imie = imie;
        }

        public Ludzie(boolean plec) {
            this.plec = plec;
        }

        public Ludzie(int wiek, String imie) {
            this.wiek = wiek;
            this.imie = imie;
        }

        public Ludzie(int wiek, String imie, String nazwisko) {
            this.wiek = wiek;
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public Ludzie(int wiek, String imie, String nazwisko, int wzrost) {
            this.wiek = wiek;
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.wzrost = wzrost;
        }

        public Ludzie(int wiek, String imie, String nazwisko, int wzrost, boolean plec) {
            this.wiek = wiek;
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.wzrost = wzrost;
            this.plec = plec;
        }

        public Ludzie(int wiek, String imie, String nazwisko, int wzrost, boolean plec, String narodowość) {
            this.wiek = wiek;
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.wzrost = wzrost;
            this.plec = plec;
            this.narodowość = narodowość;
        }

        public Ludzie(int wzrost, boolean plec, String narodowość) {
            this.wzrost = wzrost;
            this.plec = plec;
            this.narodowość = narodowość;
        }

        public Ludzie(String nazwisko, int wzrost, boolean plec, String narodowość) {
            this.nazwisko = nazwisko;
            this.wzrost = wzrost;
            this.plec = plec;
            this.narodowość = narodowość;
        }
// Wprowadź tu swoje zmienne i konstruktory
    }
}
