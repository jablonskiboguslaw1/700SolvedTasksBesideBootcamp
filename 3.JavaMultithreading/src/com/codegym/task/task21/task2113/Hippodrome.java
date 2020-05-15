package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    static Hippodrome game;

    private List<Horse> horses = new ArrayList<>();

    public Hippodrome() {
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {

        game = new Hippodrome();
        game.horses.add(new Horse("Chmura", 2, 0));
        game.horses.add(new Horse("Jasny gwint", 2, 0));
        game.horses.add(new Horse("Chmurka", 2, 0));
        game.horses.add(new Horse("Tata", 2, 0));



        game.run();
        game.printWinner();

    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);

        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }

    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();

        }
    }

    public Horse getWinner() {
        double maxDistance = 0;
        for (Horse h : horses) {
            if (h.getDistance() > maxDistance) {
                maxDistance = h.getDistance();
            }
        }
        Horse winner = null;
        for (Horse hors : horses)
            if (hors.getDistance()==maxDistance)
                winner=hors;
              {

        }return winner;
    }
    public void printWinner(){
        System.out.println("The winner is "+getWinner().getName()+"!");
    }
}



