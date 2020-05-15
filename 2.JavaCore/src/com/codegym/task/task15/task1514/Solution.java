package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();
static{ labels.put(4.0,"cos");
    labels.put(3.0,"cos2");
    labels.put(2.5,"cos3");
    labels.put(1.2,"cos4");
    labels.put(3.7,"cos5");}

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
