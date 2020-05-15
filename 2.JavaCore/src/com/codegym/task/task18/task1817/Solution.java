package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException,ArithmeticException {

        FileInputStream stream = new FileInputStream(args[0]);
        double n1 = 0;
        double n2 = 0;
        while (stream.available() > 0) {
          if (Character.isWhitespace(stream.read())) {
                n2++;
            }
                n1++;
            }
            double ratio = n2 / n1 * 100;
            stream.close();
            System.out.println(String.format("%.2f", ratio));

        }
    }

