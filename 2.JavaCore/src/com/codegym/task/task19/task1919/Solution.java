package com.codegym.task.task19.task1919;

/* 
Calculating salaries

*/

import java.io.*;
import java.util.*;
import java.util.stream.Collector;

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> mapa = new HashMap<>();

        String file = (args[0]);

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        while (reader.ready()) {
            String[] tmp = reader.readLine().split(" ");


            if (!mapa.containsKey(tmp[0]))
                mapa.put(tmp[0], Double.parseDouble(tmp[1]));
            else mapa.replace(tmp[0], (mapa.get(tmp[0]) + Double.parseDouble(tmp[1])));
        }
        reader.close();
        fileReader.close();
//
        // for (Map.Entry<String, Double> entry : mapa.entrySet())
        //        System.out.println(entry.getKey()+" "+ entry.getValue());

        List<String> keys = new ArrayList<>(mapa.keySet());
        Collections.sort(keys);

        for (String key : keys) {
            for (Map.Entry<String, Double> entry : mapa.entrySet())
                if (entry.getKey().equals(key))

                    System.out.println(entry.getKey() + " " + entry.getValue());

        }


    }
}
