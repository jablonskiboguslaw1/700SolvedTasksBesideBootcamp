package pl.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Klasa ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner keyboard = new Scanner(System.in);//tutaj wpisz swój kod
        return keyboard.nextLine();
    }

    public static int readInt() throws Exception {
        Scanner keyboard = new Scanner(System.in);//tutaj wpisz swój kod
        return keyboard.nextInt();
    }

    public static double readDouble() throws Exception {
        Scanner keyboard = new Scanner(System.in);//tutaj wpisz swój kod
        return keyboard.nextDouble();
    }

    public static boolean readBoolean() throws Exception {
        Scanner keyboard = new Scanner(System.in); //tutaj wpisz swój kod
        return keyboard.nextBoolean();
    }

    public static void main(String[] args) {

    }
}
