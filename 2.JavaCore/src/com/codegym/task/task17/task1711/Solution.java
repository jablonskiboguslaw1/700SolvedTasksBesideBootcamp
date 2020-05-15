package com.codegym.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {

        ArrayList<String> arguments = (ArrayList<String>) Arrays.asList(args);
        if (args.length != 0) {
            String key = arguments.remove(0);

            switch (args[0]) {

                case "-c":
                    synchronized (allPeople) {
                        int ind = 0;
                        while (args.length > ind) {
                            Person person = null;
                            Date date = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[ind + 3]);
                            String sex = args[ind + 2];
                            if (sex.equals("m")) {
                                person = Person.createMale(args[ind + 1], date);
                            } else if (sex.equals("f")) {
                                person = Person.createFemale(args[ind + 1], date);
                            }
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));

                            ind += 3;
                        }
                        break;
                    }

                case "-u":
                    synchronized (allPeople) {
                        int ind = 0;
                        while (args.length > ind) {
                            Date date1 = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[ind + 4]);

                            allPeople.get(Integer.parseInt(args[ind + 1])).setSex(args[ind + 3].equals("f") ? Sex.FEMALE : Sex.MALE);
                            allPeople.get(Integer.parseInt(args[ind + 1])).setName(args[ind + 2]);
                            allPeople.get(Integer.parseInt(args[ind + 1])).setBirthDate(date1);
                            ind += 3;
                        }

                        break;
                    }
                case "-d":
                    synchronized (allPeople) {
                        int ind = 0;
                        while (args.length > ind) {

                            allPeople.get(Integer.parseInt(args[ind + 1])).setName(null);
                            allPeople.get(Integer.parseInt(args[ind + 1])).setSex(null);
                            allPeople.get(Integer.parseInt(args[ind + 1])).setBirthDate(null);
                            ind += 1;
                        }
                        break;
                    }

                case "-i":
                    synchronized (allPeople) {
                        int ind = 0;
                        while (args.length > ind) {
                            System.out.print(allPeople.get(Integer.parseInt(args[ind + 1])).getName() + " ");
                            System.out.print((allPeople.get(Integer.parseInt(args[ind + 1])).getSex().equals(Sex.MALE) ? "m" : "f") + " ");
                            System.out.println(new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[ind + 1])).getBirthDate()));
                        ind+=1;
                        }
                        break;
                    }
            }
        }
    }
}
