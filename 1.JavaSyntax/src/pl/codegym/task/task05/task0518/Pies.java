package pl.codegym.task.task05.task0518;

/* 
Rejestr psów
*/

public class Pies {
    private String imie;
    private int wzrost;
    private String kolor;//tutaj wpisz swój kod


    public Pies(String imie) {
        this.imie = imie;
    }

    public Pies(String imie, int wzrost) {
        this.imie = imie;
        this.wzrost = wzrost;
    }

    public Pies(String imie, int wzrost, String kolor) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
