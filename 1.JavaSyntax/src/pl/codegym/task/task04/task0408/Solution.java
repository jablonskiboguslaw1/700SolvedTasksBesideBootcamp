package pl.codegym.task.task04.task0408;

/* 
Dobry czy zły?
*/

public class Solution {
    public static void main(String[] args) {
        porownaj(3);
        porownaj(6);
        porownaj(5);
    }

    public static void porownaj(int a) {
        if (a>5) System.out.println("Liczba jest większa niż 5");//tutaj wpisz swój kod
        else if (a<5) System.out.println("Liczba jest mniejsza niż 5");//tutaj wpisz swój kod
        else System.out.println("Liczba jest równa 5");//tutaj wpisz swój kod
    }
}