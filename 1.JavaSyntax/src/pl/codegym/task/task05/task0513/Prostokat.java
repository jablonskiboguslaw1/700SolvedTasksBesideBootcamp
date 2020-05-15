package pl.codegym.task.task05.task0513;

/* 
Stwórzmy sobie prostokąt
*/

public class Prostokat {
   private int gora,lewy,szerokosc,wysokosc; //tutaj wpisz swój kod

    public void inicjalizuj(int gora, int lewy, int szerokosc, int wysokosc) {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public  void inicjalizuj(int gora, int lewy, int szerokosc) {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
    }

    public void inicjalizuj(int gora, int lewy) {
        this.gora = gora;
        this.lewy = lewy;
    }

    public  void inicjalizuj(int gora) {
        this.gora = gora;
    }

    public static void main(String[] args) {

    }
}
