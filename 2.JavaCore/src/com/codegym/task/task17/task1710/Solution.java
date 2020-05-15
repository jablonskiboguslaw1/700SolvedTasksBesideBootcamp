package com.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
      //  System.out.println(( allPeople.get(Integer.parseInt("1")).getSex().equals(Sex.MALE)? "m" : "f"));
        if (args.length != 0)
            switch (args[0]) {

                case "-c":
                    Date date = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[3]);
                    if (args[2].equals("m")) {
                        allPeople.add(Person.createMale(args[1], date));
                    } else if (args[2].equals("f")) {
                        allPeople.add(Person.createFemale(args[1], date));
                    }
                    System.out.println(allPeople.size() - 1);
                    break;
                case "-u":
                    Date date1 = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[4]);

                    allPeople.get(Integer.parseInt(args[1])).setSex(args[3].equals("f") ? Sex.FEMALE : Sex.MALE);
                    allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(date1);
                    break;
                case "-d":
                    allPeople.get(Integer.parseInt(args[1])).setSex(null);
                    allPeople.get(Integer.parseInt(args[1])).setName(null);
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                    break;

                case "-i":

                    System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() +
                            " " +( allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)? "m" : "f") +
                            " " + new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));

            }
    }
}
