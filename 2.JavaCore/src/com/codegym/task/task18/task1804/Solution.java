package com.codegym.task.task18.task1804;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer value = 1;
        int temp;
        while (fileReader.available() > 0) {
            temp = fileReader.read();
            if (map.containsKey(temp))
                map.replace(temp, map.get(temp) + 1);
            else map.put(temp, value);
        }


        int min = Integer.MAX_VALUE;
        for (Map.Entry ent : map.entrySet())
            if ((int) ent.getValue() < min)
                min = (int) ent.getValue();

        for (Map.Entry ent : map.entrySet())
            if ((int) ent.getValue() == min)
                System.out.print(ent.getKey() + " ");


        fileReader.close();
    }


}

