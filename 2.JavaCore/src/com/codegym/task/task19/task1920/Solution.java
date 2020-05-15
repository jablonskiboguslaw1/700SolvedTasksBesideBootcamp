package com.codegym.task.task19.task1920;

/* 
The richest

*/

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        Map<String, Double> mapa = new HashMap<>();
        String[] tmp;
        while (reader.ready()) {
            tmp = reader.readLine().split(" ");

            if (!mapa.containsKey(tmp[0]))
                mapa.put(tmp[0], Double.parseDouble(tmp[1]));
            else
                mapa.replace(tmp[0], (mapa.get(tmp[0]) + Double.parseDouble(tmp[1])));
        }
        reader.close();
        fileReader.close();

       // for (Map.Entry<String,Double> entry : mapa.entrySet())
           // System.out.println(entry.getKey()+" "+ entry.getValue());
        Double max = Collections.max(mapa.values());

        List<String> keys = new ArrayList<>(mapa.keySet());
        Collections.sort(keys);

        //System.out.println(keys);
        for (String key : keys) {
            for (Map.Entry<String,Double> entry : mapa.entrySet())
                if (entry.getKey().equals(key))
                    if (entry.getValue().equals(max))
                        System.out.println(entry.getKey());

        }

    }
}





