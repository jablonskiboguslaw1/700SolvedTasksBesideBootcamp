package pl.codegym.task.task09.task0918;

/*
Wszyscy są naszymi kumplami, nawet wyjątki
*/

import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends RuntimeException{
    }

    static class MyException2 extends RuntimeException{
    }

    static class MyException3 extends FileNotFoundException {
    }

    static class MyException4 extends FileNotFoundException{
    }
}
