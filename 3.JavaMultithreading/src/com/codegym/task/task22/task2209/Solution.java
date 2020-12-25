package com.codegym.task.task22.task2209;

/* 
Make a word chain

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        // String path2 = "C:\\Users\\Bogus\\Desktop\\nowy.txt";
        Scanner scanner1 = new Scanner(new File(path));

        String[] s1 = scanner1.nextLine().toLowerCase().split(" ");
        // ...
        // String s = "Okinawa Poland Washington Auckland Kalamazoo Norfolk".toLowerCase();
        //String s2 = "Okinawa ZZz Washington Zurich Auckland Alexandria Kalamazoo Ottowa Orlando jjj Norfolk".toLowerCase();
        // List<String> list = new ArrayList<>(Arrays.asList(s1.split(" ")));
        // String[] strs = s1.split(" ");
        StringBuilder result = getLine(s1);
        System.out.println(result.toString());


        // System.out.println(chainMaker(list, list));

    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0) {
            return new StringBuilder();
        } else {
            List<String> lista = new LinkedList<>(Arrays.asList(words));
            String s = chainMaker(lista, lista).get(0);
            String[] split = s.split("-");
            if (words.length == split.length) {
                StringBuilder builder = new StringBuilder();
                for (String str : split) {
                    String temp = (str.substring(0, 1).toUpperCase() + str.substring(1)).trim();
                    builder.append(temp).append(" ");
                }
                builder.deleteCharAt(builder.length() - 1);
                return builder;
            } else return new StringBuilder();
        }
    }

    public static List<String> chainMaker(List<String> list, List<String> list2) {
        List<String> tempList = new LinkedList<>();

        for (String str : list) {
            for (String str2 : list2) {
                if (!str2.contains(str)) {
                    if (str.charAt(str.length() - 1) == str2.charAt(0)) {
                        tempList.add(str + "-" + str2);
                    }
                }
            }
        }
        // System.out.println(tempList);
        if (tempList.size() == 0) {

            return list2;
        } else
            return chainMaker(list, tempList);

    }
}






