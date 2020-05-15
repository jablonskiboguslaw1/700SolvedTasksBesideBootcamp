package pl.codegym.task.task13.task1309;

/* 
Wszystko, co się porusza
*/

public class Solution {
    public static void main(String[] args) {
    }
    public interface CanMove{
        Double speed();
    }
    public interface CanFly extends CanMove{
        Double speed(CanFly a);
    }
}