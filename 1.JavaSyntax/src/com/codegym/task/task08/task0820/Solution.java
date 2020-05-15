package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
result.add(new Cat());
result.add(new Cat());
result.add(new Cat());
result.add(new Cat());
        //write your code here

        return result;
    }

    public static Set<Dog> createDogs() {
       HashSet<Dog> dogs = new HashSet<>();
       dogs.add(new Dog());//write your code here
       //write your code here
       dogs.add(new Dog());//write your code here
       dogs.add(new Dog());//write your code here
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(dogs);
        pets.addAll(cats);//write your code here
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeIf(cats::contains);
           //write your code here
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet: pets)
            System.out.println(pet);
          //write your code here
    }

   public static class Dog{} //write your code here
   public static class Cat{} //write your code here
}
