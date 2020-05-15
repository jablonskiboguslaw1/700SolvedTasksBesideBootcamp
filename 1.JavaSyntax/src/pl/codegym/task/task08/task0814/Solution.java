package pl.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Większa niż 10? Wcale do nas nie pasujesz!
*/

public class Solution {
    public static HashSet<Integer> utworzSet() {
        HashSet<Integer> liczby = new HashSet<>();
        liczby.add(2);// tutaj wpisz swój kod
        liczby.add(1);// tutaj wpisz swój kod
        liczby.add(3);// tutaj wpisz swój kod
        liczby.add(4);// tutaj wpisz swój kod
        liczby.add(5);// tutaj wpisz swój kod
        liczby.add(26);// tutaj wpisz swój kod
        liczby.add(27);// tutaj wpisz swój kod
        liczby.add(6);// tutaj wpisz swój kod
        liczby.add(7);// tutaj wpisz swój kod
        liczby.add(8);// tutaj wpisz swój kod
        liczby.add(9);// tutaj wpisz swój kod
        liczby.add(10);// tutaj wpisz swój kod
        liczby.add(21);// tutaj wpisz swój kod
        liczby.add(22);// tutaj wpisz swój kod
        liczby.add(24);// tutaj wpisz swój kod
        liczby.add(44);// tutaj wpisz swój kod
        liczby.add(11);// tutaj wpisz swój kod
        liczby.add(12);// tutaj wpisz swój kod
        liczby.add(14);// tutaj wpisz swój kod
        liczby.add(34);// tutaj wpisz swój kod
return liczby;
    }

    public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
        set.removeIf(next->next>10);// tutaj wpisz swój kod
return set;
    }

    public static void main(String[] args) {


    }
}
