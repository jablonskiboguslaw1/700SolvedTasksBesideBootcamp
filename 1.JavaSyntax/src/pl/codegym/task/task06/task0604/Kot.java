package pl.codegym.task.task06.task0604;

/* 
Licznik kotów
*/

public class Kot {
    public static int licznikKotow = 0;

    public Kot() {
        licznikKotow++;
    }
    protected void finalize() throws Throwable{
       licznikKotow--;
    }
//tutaj wpisz swój kod

    public static void main(String[] args) {

    }
}