package pl.codegym.task.task08.task0824;

/*
Załóż rodzinę
*/


import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
       Ludzie wnuk1 = new Ludzie("pimpus",true,15); //tutaj wpisz swój kod
       Ludzie wnuk2 = new Ludzie("pimpus2",false,13); //tutaj wpisz swój kod
       Ludzie wnuk3 = new Ludzie("pimpus3",true,17);
       Ludzie matka = new Ludzie("natura", false,43);
       Ludzie ojciec = new Ludzie("zeus", true,44);
       Ludzie dziadek1 = new Ludzie("tytan", true,70);
       Ludzie dziadek2 = new Ludzie("cyklop", true,71);
       Ludzie babcia2 = new Ludzie("zosia", false,65);
       Ludzie babcia1 = new Ludzie("teresa", false,54);
       ojciec.dzieci.add(wnuk1);
       ojciec.dzieci.add(wnuk2);
       ojciec.dzieci.add(wnuk3);
        matka.dzieci.add(wnuk1);
        matka.dzieci.add(wnuk2);
        matka.dzieci.add(wnuk3);
        dziadek1.dzieci.add(ojciec);
        dziadek2.dzieci.add(matka);
        babcia1.dzieci.add(ojciec);
        babcia2.dzieci.add(matka);
        System.out.println(dziadek1.toString());
        System.out.println(dziadek2.toString());
        System.out.println(babcia1.toString());
        System.out.println(babcia2.toString());
        System.out.println(matka.toString());
        System.out.println(ojciec.toString());
        System.out.println(wnuk1.toString());
        System.out.println(wnuk2.toString());
        System.out.println(wnuk3.toString());


    }

    public static class Ludzie {
       String imie;
       boolean plec;
       int wiek;
       ArrayList<Ludzie> dzieci;

        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
           dzieci = new ArrayList<>();
        }
        //tutaj wpisz swój kod

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i <licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }

}
