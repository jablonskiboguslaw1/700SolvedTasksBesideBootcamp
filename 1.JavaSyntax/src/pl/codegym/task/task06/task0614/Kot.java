package pl.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Statyczne koty
*/

public class Kot {
    public static ArrayList<Kot> koty = new ArrayList<>();//tutaj wpisz swój kod

    public Kot() {

    }

    public static void main(String[] args) {

        Kot kot1 = new Kot();//tutaj wpisz swój kod
        Kot kot2 = new Kot();//tutaj wpisz swój kod
        Kot kot3 = new Kot();//tutaj wpisz swój kod
        Kot kot4 = new Kot();//tutaj wpisz swój kod
        Kot kot5 = new Kot();//tutaj wpisz swój kod
        Kot kot6 = new Kot();//tutaj wpisz swój kod
        Kot kot7 = new Kot();//tutaj wpisz swój kod
        Kot kot8 = new Kot();//tutaj wpisz swój kod
        Kot kot9 = new Kot();//tutaj wpisz swój kod
        Kot kot10 = new Kot();
        koty.add(kot1);//tutaj wpisz swój kod
        koty.add(kot2);//tutaj wpisz swój kod
        koty.add(kot3);//tutaj wpisz swój kod
        koty.add(kot4);//tutaj wpisz swój kod
        koty.add(kot5);//tutaj wpisz swój kod
        koty.add(kot6);//tutaj wpisz swój kod
        koty.add(kot7);//tutaj wpisz swój kod
        koty.add(kot8);//tutaj wpisz swój kod
        koty.add(kot9);//tutaj wpisz swój kod
        koty.add(kot10);//tutaj wpisz swój kod
        printKoty();
    }

    public static void printKoty() {
        for (Kot kot: koty)
            System.out.println(kot); //tutaj wpisz swój kod
    }
}
