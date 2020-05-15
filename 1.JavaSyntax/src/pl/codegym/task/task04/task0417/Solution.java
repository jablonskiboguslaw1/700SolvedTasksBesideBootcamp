package pl.codegym.task.task04.task0417;

/* 
Masz parę?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();//tutaj wpisz swój kod
        String num2 = reader.readLine();//tutaj wpisz swój kod
        String num3 = reader.readLine();//tutaj wpisz swój kod
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        if (n1 == n2 && n1 == n3) System.out.println(n1 + " " + n2 + " " + n3);
        else if (n1 == n2) System.out.println(n1 + " " + n2);
        else if (n2 == n3) System.out.println(n2 + " " + n3);
        else if (n1 == n3) System.out.println(n1 + " " + n3);


    }
}