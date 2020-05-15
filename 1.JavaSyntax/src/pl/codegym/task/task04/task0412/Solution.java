package pl.codegym.task.task04.task0412;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//tutaj wpisz swój kod
        String num = reader.readLine();
        int number = Integer.parseInt(num);
        if (number==0)
            System.out.println(number);
        else if (number<0)
            System.out.println(number+1);
        else System.out.println(number*2);
    }

}