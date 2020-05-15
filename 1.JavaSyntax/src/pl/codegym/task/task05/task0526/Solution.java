package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {
    public static void main(String[] args) {
      Mezczyzna ziomek = new Mezczyzna("Franek",40,"zadupie") ; //tutaj wpisz swój kod
      Mezczyzna ziomek2 = new Mezczyzna("Franek",40,"zalesie");
      Kobieta laska = new Kobieta("Zocha",30,"zarzecze");
      Kobieta laska2 = new Kobieta("Ziuta",32,"zarzecze");
      //tutaj wpisz swój kod
        System.out.println(ziomek.imie+" "+ziomek.wiek+" "+ziomek.adres);
        System.out.println(ziomek2.imie+" "+ziomek2.wiek+" "+ziomek2.adres);
        System.out.println(laska.imie+" "+laska.wiek+" "+laska.adres);
        System.out.println(laska2.imie+" "+laska2.wiek+" "+laska2.adres);

    }
public static class Mezczyzna{
   private String imie;
   private int wiek ;
   private String adres;

    public Mezczyzna(String imie, int wiek, String adres) {
        this.imie = imie;
        this.wiek = wiek;
        this.adres = adres;
    }
}
public static class Kobieta{
    private String imie;
    private int wiek ;
    private String adres;

    public Kobieta(String imie, int wiek, String adres) {
        this.imie = imie;
        this.wiek = wiek;
        this.adres = adres;
    }
}
    //tutaj wpisz swój kod
}
