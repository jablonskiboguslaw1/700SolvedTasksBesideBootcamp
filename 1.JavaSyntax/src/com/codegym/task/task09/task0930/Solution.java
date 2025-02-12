package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        List<String> stringList = new LinkedList<>();

        List<Integer> numberList = new LinkedList<>();
        int[] positions = new int[array.length];
        for (int i = 0; i < array.length; i++) {


            if (isNumber(array[i])) {
                numberList.add(Integer.parseInt(array[i]));
                positions[i] = 1;
            } else stringList.add(array[i]);
        }
        stringList.sort(String::compareTo);
        String tmp = "";
        for (int i = 0; i < stringList.size(); i++) {
            for (int j = 0; i < stringList.size() - 1 - i; i++){

                if (isGreaterThan(stringList.get(j), stringList.get(j + 1))){
            tmp = stringList.get(j + 1);
            stringList.set(j + 1, stringList.get(j));
            stringList.set(j, tmp);

        }}}


        numberList.sort(Integer::compareTo);
        Collections.reverse(numberList);

        for (int i = 0; i < positions.length; i++) {
            if ((positions[i]) == 1) {
                array[i] = numberList.get(0).toString();
                numberList.remove(0);
            } else {
                array[i] = stringList.get(0);
                stringList.remove(0);
            }
        }
    }
    // write your code here


    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
