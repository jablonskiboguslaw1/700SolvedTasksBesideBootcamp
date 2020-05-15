package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }// Add static block here

    public static void readKeyFromConsoleAndInitPlanet() {
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       if (input.equals(Planet.EARTH))
           thePlanet=Earth.getInstance();
       else if (input.equals(Planet.MOON))
           thePlanet=Moon.getInstance();
       else if (input.equals(Planet.SUN))
           thePlanet = Sun.getInstance();
       else thePlanet=null;


           // Implement step #5 here
    }
}
