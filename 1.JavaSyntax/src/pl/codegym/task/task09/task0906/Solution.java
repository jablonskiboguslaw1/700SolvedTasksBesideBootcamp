package pl.codegym.task.task09.task0906;

/*
Logowanie śladów stosu
*/

public class Solution {
    public static void main(String[] args) {
        log("w metodzie main");
    }

    public static void log(String s) {
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName()+": "+Thread.currentThread().getStackTrace()[2].getMethodName()+": "+s); //tutaj wpisz swój kod
    }
}
