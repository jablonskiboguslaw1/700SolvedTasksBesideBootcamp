package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      Date date = dateFormat.parse(scanner.nextLine());
      SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        System.out.println(dateFormat2.format(date).toUpperCase());

    }
}
