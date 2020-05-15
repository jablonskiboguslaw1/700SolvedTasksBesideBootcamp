package pl.codegym.task.task06.task0613;

/* 
Kot i statyczne
*/

public class Solution {
    public static void main(String[] args) {
        Kot ko1 = new Kot();// Tworzy 10 kotów
        Kot ko2 = new Kot();
        Kot ko3 = new Kot();
        Kot ko4 = new Kot();
        Kot ko5 = new Kot();
        Kot ko6 = new Kot();
        Kot ko7 = new Kot();
        Kot ko8 = new Kot();
        Kot ko9 = new Kot();
        Kot ko10 = new Kot();

        System.out.println(Kot.licznikKotow);
        // Wyświetla wartość zmiennej licznikKotow
    }

    public static class Kot {
        public static int licznikKotow=0;

        public Kot() {
            licznikKotow++;
        }

        // Tworzy zmienną statyczną licznikKotow

        // Deklaruje konstruktor
    }
}
