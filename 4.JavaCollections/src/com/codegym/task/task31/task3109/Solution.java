package com.codegym.task.task31.task3109;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/* 
Reading config files

*/
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Solution solution = new Solution();
        Properties //properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.xml");
                // properties.list(System.out);

                properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/notExists");
        properties.list(System.out);
    }


    public Properties getProperties(String fileName) throws FileNotFoundException {
        Properties props = new Properties();
        File file = new File(fileName);
        if (file.getName().endsWith(".xml")) {
            try {
                props.loadFromXML(new FileInputStream(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (file.exists()) {
            try {
                props.load(new FileInputStream(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return props;
    }
}
