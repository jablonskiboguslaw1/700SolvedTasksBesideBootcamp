package com.codegym.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Build a WHERE query

*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Johnson");
        map.put("country", "United States");
        map.put("City", "Los Angeles");
        map.put("age", null);
       /* {
            name = Johnson, country = United States, city = Los Angeles, age = null
        }*/
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        if (params == null)
            return "";
        else {
            StringBuilder builder = new StringBuilder("");
            for (Map.Entry<String, String> entry : params.entrySet())
                if ((entry.getValue() != null) && (!entry.getValue().equals("null")))
                    builder.append(entry.getKey()).append(" = '").append(entry.getValue()).append("' and ");
            if (builder.toString().endsWith("and "))
                builder.delete(builder.length() - 5, builder.length());

            return builder.toString();
        }
    }

}

