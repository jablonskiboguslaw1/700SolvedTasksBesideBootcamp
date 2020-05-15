package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        showList(url);

        chooseAlert(url);
    }

    private static void chooseAlert(String url) {
        if (url.contains("obj")) {
           String objPar= url.substring(url.indexOf("obj"),url.indexOf("&",url.indexOf("obj")));
           String[] strTab= objPar.split("=");
            try {
                double par = Double.parseDouble(strTab[1]);
                alert(par);
            }catch (Exception e){
                alert(strTab[1]);
            }
        }
    }

    private static void showList(String url) {


            String[] strings = (url.split("\\?")[1]).split("&");
            List<String> paramNames = new LinkedList<>();
            for (String s : strings) {
                paramNames.add(s.split("=")[0]);
            }

            for (String str : paramNames)
                System.out.print(str + " ");
        System.out.println();
        }



    //write your code here


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
