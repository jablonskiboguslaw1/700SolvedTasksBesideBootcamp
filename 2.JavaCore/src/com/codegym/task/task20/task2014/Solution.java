package com.codegym.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution

*/
public class Solution implements Serializable {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Bogus\\Desktop\\transition.txt");
        try {

            ObjectOutputStream newOut = new ObjectOutputStream(new FileOutputStream(file));
            Solution savedObject = new Solution(4);
            newOut.writeObject(savedObject);
            Solution loadedObject = new Solution(5);
            newOut.close();
            ObjectInputStream newInput = new ObjectInputStream(new FileInputStream(file));
            try {
                loadedObject = (Solution) newInput.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println((savedObject.string.equals(loadedObject.string)));

            newInput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(new Solution(4));
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
