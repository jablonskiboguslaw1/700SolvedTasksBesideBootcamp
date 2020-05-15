package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    private String imie, adres, kolor;
    private int waga, wiek;
    //tutaj wpisz swój kod

    public void inicjalizuj(String imie) {
        this.imie = imie;
        this.kolor = "default";
        this.waga = 5;
        this.wiek = 1;
    }

    public void inicjalizuj(String imie, int waga, int wiek) {
        this.imie = imie;
        this.kolor = "default";
        this.waga = waga;
        this.wiek = wiek;
    }
    public void inicjalizuj(String imie, int wiek) {
        this.imie = imie;
        this.kolor = "default";
        this.waga = 5;
        this.wiek = wiek;
    }

    public void inicjalizuj( int waga,String kolor) {

        this.kolor = kolor;
        this.waga = waga;
        this.wiek = 1;

    }

    public void inicjalizuj(int waga, String kolor,String adres ) {

        this.adres = adres;
        this.kolor = kolor;
        this.waga = waga;
        this.wiek = 1;
    }

    public static void main(String[] args) {

    }
}
