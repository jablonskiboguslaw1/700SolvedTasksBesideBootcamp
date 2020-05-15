package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        double a = keyboard.nextDouble();
        double sum = 0;
        double acc = 0;
        while (a != -1) {
            sum += a;
            acc++;
            a = keyboard.nextDouble();
        }
        System.out.println(sum / acc);


        //tutaj wpisz swój kod
    }
}

