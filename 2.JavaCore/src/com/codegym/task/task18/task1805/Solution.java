package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStreamReader = new FileInputStream(reader.readLine());
        HashSet<Integer> set = new HashSet<>();
        while (inputStreamReader.available()>0)
            set.add(inputStreamReader.read());

        ArrayList<Integer> list = new ArrayList<>(set);
        list.sort(Integer::compareTo);
        for (Integer inty: list)
            System.out.print(inty+" ");

        inputStreamReader.close();
    }
}
