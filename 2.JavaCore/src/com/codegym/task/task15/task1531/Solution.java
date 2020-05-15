package com.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger result = BigInteger.valueOf(n);
        for (int i = n - 1; i > 0; i--) {
            result= result.multiply(BigInteger.valueOf(i));
        }
        if (n == 0)
            result = BigInteger.valueOf(1);
        if (n < 0) result = BigInteger.valueOf(0);
        return String.valueOf(result);
    }
}
