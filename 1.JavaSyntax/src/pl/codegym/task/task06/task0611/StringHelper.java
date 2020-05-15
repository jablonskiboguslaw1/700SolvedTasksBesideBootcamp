package pl.codegym.task.task06.task0611;

/* 
Klasa StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String wynik = "";
        for (int i = 1; i <=5;i++)
            wynik+=s;
        return wynik;
    }

    public static String multiply(String s, int licznik) {
        String wynik = "";
        for (int i = 1; i <=licznik;i++)
            wynik+=s;
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Amigo"));
        System.out.println(multiply("Amigo",6));
    }
}
