package com.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>(); //write your code here
        map.put("kimono", "franek");
        map.put("kimo", "janek");
        map.put("kimonos", "franek");
        map.put("kimon", "inek");
        map.put("kim", "franek");
        map.put("kono", "janek");
        map.put("ki", "ola");
        map.put("mono", "hania");
        map.put("no", "zosia");
        map.put("noewr", "osia");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (String str : map.values())
            if (!list1.contains(str))
                list1.add(str);
            else list2.add(str);

        for (String s : list2)
            removeItemFromMapByValue(map, s);

    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
