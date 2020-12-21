package com.codegym.task.task25.task2502;

import java.util.*;

/* 
Don't take the car to the shop!

*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            boolean flag = false;
            if (loadWheelNamesFromDB().length != 4)
                throw new Exception();
            else

                wheels = new ArrayList<>();
            for (Wheel wheel : Wheel.values()) {
                if (!Arrays.asList(loadWheelNamesFromDB()).contains(wheel.toString()))
                    flag = true;
                wheels.add(wheel);
            }
            if (flag)
                throw new Exception();

            // Init wheels here
        }

        protected String[] loadWheelNamesFromDB() {
            // This method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
           // return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT","FRONT_LEFT"};
        }
    }

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        System.out.println(car.wheels.toString());
    }
}
