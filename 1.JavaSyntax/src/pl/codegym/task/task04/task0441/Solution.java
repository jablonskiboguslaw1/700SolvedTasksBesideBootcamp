package pl.codegym.task.task04.task0441;


/* 
Jakiś taki przeciętny
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner keyboard = new Scanner(System.in);
       int a = keyboard.nextInt();
       int b = keyboard.nextInt();
       int c = keyboard.nextInt();

       if (( a<b && a>c) ||( a>b && a<c))
           System.out.println(a);
        else if (( b<a && b>c) ||( b>a && b<c))
            System.out.println(b);
        else if (( c<b && c>a) ||( c>b && c<a))
            System.out.println(c);
        else if ((a==b)||(a==c))
           System.out.println(a);
        else System.out.println(b);//tutaj wpisz swój kod
    }
}
