package pl.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Bank-świnka na bazie konsoli
*/

public class Solution {
    public static void main(String[] args) throws Exception {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int sum=0;

               String str = reader.readLine();

           while (!( str. equals("sumuj"))){
               sum+= Integer.parseInt(str);
               str= reader.readLine();}
        System.out.println(sum);

           //tutaj wpisz swój kod}
    }
}
