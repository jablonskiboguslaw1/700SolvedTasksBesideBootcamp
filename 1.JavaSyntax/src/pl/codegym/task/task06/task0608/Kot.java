package pl.codegym.task.task06.task0608;

/* 
Metody statyczne dla kotów
*/

public class Kot {
    private static int licznikKotow = 0;

    public Kot() {
        licznikKotow++;
    }

    public static int getLicznikKotow() {
       return licznikKotow;//tutaj wpisz swój kod

    }

    public static void setLicznikKotow(int licznikKotow) {
        Kot.licznikKotow = licznikKotow;//tutaj wpisz swój kod

    }

    public static void main(String[] args) {

    }
}
