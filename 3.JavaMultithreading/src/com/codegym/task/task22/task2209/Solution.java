package com.codegym.task.task22.task2209;

import java.math.BigInteger;
import java.util.*;

/*
Make a word chain

*/
public class Solution {
    public static void main(String[] args) {
        // ...
        String[] t = new String[]{"Okinawa", "Washington", "Auckland", "Kalamazoo", "Norfolk"};
getLine(t);
                //  StringBuilder result = getLine();
     //   System.out.println(result.toString());
    }

    public static void getLine(String... words) {
        StringBuilder builder = new StringBuilder();
        Queue<String> list = new LinkedList<>(Arrays.asList(words));
        List<String> listNew = new LinkedList<>();
        String first = list.poll();
        list.add(first);
        int number = words.length;
        long numOftryes = factorialUsingRecursion(number)*25;
        while (numOftryes>0){
            if( first.toLowerCase().charAt(first.length()-1)==list.peek().toLowerCase().charAt(0))
                listNew.add(list.poll());
            else list.add(list.poll());
            numOftryes--;
        }


        for (String str: listNew)
            System.out.println(str);

    }
    public static long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }
}

