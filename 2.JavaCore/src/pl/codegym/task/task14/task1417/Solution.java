package pl.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Waluty
*/

public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " ma schowane " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //tutaj wpisz swój kod
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            allMoney.add(new Euro(33));
            allMoney.add(new USD(66));
            allMoney.add(new Ruble(99));
            return allMoney;
        }
    }
}
