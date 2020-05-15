package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        for (Cat c :cats){
            cats.remove(c);
        break;}




        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());//write your code here. step 2
        set.add(new Cat());//write your code here. step 2
        set.add(new Cat());//write your code here. step 2
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat c: cats)
            System.out.println(c);
          // step 4
    }

  public static class Cat{

  }  // step 1
}
