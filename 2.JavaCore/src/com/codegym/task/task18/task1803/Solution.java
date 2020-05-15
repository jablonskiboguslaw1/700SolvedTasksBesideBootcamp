package com.codegym.task.task18.task1803;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer value = 1;
        int temp;
        while (fileInputStream.available() > 0) {
            temp = fileInputStream.read();
            if (map.containsKey(temp)) {
                map.replace(temp, map.get(temp) + 1);
            } else map.put(temp, value);
        }
        int max = 0;
        for (Map.Entry ent : map.entrySet())
            if ((int) ent.getValue() > max)
                max = (int) ent.getValue();

        for (Map.Entry entr : map.entrySet())
            if ((int) entr.getValue() == max)
                System.out.print(entr.getKey() + " ");


        fileInputStream.close();
    }
}

