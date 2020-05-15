package pl.codegym.task.task05.task0517;

/* 
Tworzenie kotów
*/

public class Kot {
    String imie;
    int wiek;
    int waga;
    String adres;
    String kolor;

    public Kot(String imie) {
        this.imie = imie;
        this.wiek = 1;
        this.waga = 5;
        this.kolor = "default";
    }

    public Kot(String imie,int waga, int wiek  ) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.kolor = "kolor";
    }
    public Kot(String imie, int wiek  ) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = 5;
        this.kolor = "kolor";}
//tutaj wpisz swój kod

    public Kot( int waga, String kolor) {

        this.wiek = 1;
        this.waga = waga;
        this.kolor = kolor;
    }

    public Kot(int waga, String kolor, String adres) {
        this.wiek =1;
        this.waga = waga;
        this.adres = adres;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
