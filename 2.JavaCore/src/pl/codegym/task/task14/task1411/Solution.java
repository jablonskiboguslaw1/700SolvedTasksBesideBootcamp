package pl.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, loser, coder i programmer
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = reader.readLine();
        ArrayList<String> osoby = new ArrayList<>();
        while (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("programmer"))
        {osoby.add(key);
        key = reader.readLine();};// Pętla do wczytywania kluczy. Punkt 1

            ArrayList<Person> persons = new ArrayList<>();// Tworzy obiekt. Punkt 2
            for (String str : osoby) {
                if (str.equals("user"))
                    persons.add(new User());
                if (str.equals("loser"))
                    persons.add(new Loser());
                if (str.equals("coder"))
                    persons.add(new Coder());
                if (str.equals("programmer"))
                    persons.add(new Programmer());
            }


            for (Person person : persons)

                doWork(person); // Wywołuje doWork

        }


    public static void doWork(Person person) {
        if (person instanceof User)
            User.live();
        if (person instanceof Loser)
            Loser.doNothing();
        if (person instanceof Coder)
            Coder.writeCode();
        if (person instanceof Programmer)
            Programmer.enjoy();
    }
}
