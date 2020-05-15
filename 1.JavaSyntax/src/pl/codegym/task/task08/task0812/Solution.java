package pl.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Najdłuższa sekwencja
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(new Scanner(System.in).nextInt());
        lista.add(new Scanner(System.in).nextInt());
        lista.add(new Scanner(System.in).nextInt());
        lista.add(new Scanner(System.in).nextInt());
        lista.add(new Scanner(System.in).nextInt());
        lista.add(new Scanner(System.in).nextInt());
        lista.add(new Scanner(System.in).nextInt());
        lista.add(new Scanner(System.in).nextInt());
        lista.add(new Scanner(System.in).nextInt());
        lista.add(new Scanner(System.in).nextInt());


        int temp=0;
        int temp2=0;
        for (int i =0; i<lista.size()-1;i++) {

            if (lista.get(i).equals(lista.get(i + 1))) {
                temp++;
                if (temp > temp2)
                    temp2 = temp;
            } else {
                temp = 0;
            }
        }

        temp2++;


        System.out.println(temp2);

    }

}