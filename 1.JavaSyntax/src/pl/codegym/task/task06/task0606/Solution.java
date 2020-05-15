package pl.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int liczba = keyboard.nextInt();

        for (int i = liczba; i != 0; i /= 10) {
            if ((i % 2 != 0)) {
                nieparzyste++;
            } else {
                parzyste++;
            }


        }
        System.out.println("Parzyste: "+parzyste+ " Nieparzyste: "+ nieparzyste);

        //tutaj wpisz swój kod
    }
}
