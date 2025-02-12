package pl.codegym.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Graj i tańcz
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("wyjdz")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
       if (person instanceof Dancer)
           ((Dancer) person).dance();
       if (person instanceof Player)
           ((Player) person).play();
       //tutaj wpisz swój kod
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("gramy");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("tańczymy");
        }
    }
}
