package pl.codegym.task.task10.task1007;

/* 
Zadanie nr 7 z konwersją typu int
*/

public class Solution {
    public static void main(String[] args) {
        long l = (int) 1234_564_890L;
        int x = (short) 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f =  l++ + 10 + ++x - (int) m;
        l = (int) f / 1000;
        System.out.println(l);
    }
}