package pl.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Metoda w try-catch
*/

public class Solution {
    public static void main(String[] args) {
        czytajDane();
    }

    public static void czytajDane() {
        Scanner kaybo = new Scanner(System.in);
        ArrayList<Integer>dane = new ArrayList<>();
       try{
           while (true){dane.add(kaybo.nextInt());}//tutaj wpisz swój kod
    }catch (Exception e){
           for (Integer intu : dane)
           System.out.println(intu);}
    }
}
