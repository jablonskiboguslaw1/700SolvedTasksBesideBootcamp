package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String file = reader.readLine();

      FileInputStream stream = new FileInputStream(file);
      BufferedReader  reader1 = new BufferedReader(new InputStreamReader(stream));
      ;
      while (reader1.ready()){
            System.out.println(reader1.readLine());// write your code here
        }
      reader1.close();
      stream.close();

    }
}