package com.codegym.task.task19.task1919;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Demo {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Peterson", 2.0);
        map.put("Smith", 6.0);
        map.put("Baxter", 1.35);
        map.put("Peterson", 3.1);

        for (Map.Entry<String, Double> entry : map.entrySet())
            System.out.println(entry.getKey()+" "+ entry.getValue());

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("fruit", "mango");
        hashmap.put("fruit", "apple");
        hashmap.put("fruit", "orange");
        hashmap.put("fruit", "banana");
        for (Map.Entry<String,String> entry : hashmap.entrySet())
            System.out.println(entry.getKey()+" "+ entry.getValue());

}}