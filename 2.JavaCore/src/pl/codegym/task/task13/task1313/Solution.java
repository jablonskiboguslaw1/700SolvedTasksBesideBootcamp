package pl.codegym.task.task13.task1313;

import java.awt.*;

/* 
Lis to zwierzę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }
}