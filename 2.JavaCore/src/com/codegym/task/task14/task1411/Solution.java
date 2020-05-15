package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        // String[] allowedKeys = new String[]{"user", "loser", "coder", "programmer"};
        ArrayList<String> keys = new ArrayList<>();
        String key = null;

        while (true) {
            key = reader.readLine();
            if (!(key.equals("user")
                    || key.equals("loser")
                    || key.equals("coder")
                    || key.equals("programmer"))) {
                break;
            } else
                keys.add(key);
        }


        // Here's the loop for reading the keys. Item 1

            for (String s : keys) {

                    if (s.equals("user"))
                        person = new Person.User();
                    if (s.equals("loser"))
                        person = new Person.Loser();
                    if (s.equals("coder"))
                        person = new Person.Coder();
                    if (s.equals("programmer"))
                        person = new Person.Programmer();

                    // Create an object. Item 2

                    doWork(person); // Call doWork
                }}


    public static void doWork(Person person) {
        if (person instanceof Person.User)
            ((Person.User) person).live();
        if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        if (person instanceof Person.Programmer)
            ((Person.Programmer) person).enjoy();// Item 3
    }
}
