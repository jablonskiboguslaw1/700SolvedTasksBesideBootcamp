package pl.codegym.task.task04.task0416;

/* 
Przejście przez ulicę na oślep
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sT = reader.readLine();
        double t = Double.parseDouble(sT);
        if (t%5.0>=3){
            if (t%5.0>=4)
            System.out.println("czerwone");
            else System.out.println("pomarańczowe");}
        else System.out.println("zielone");
}}