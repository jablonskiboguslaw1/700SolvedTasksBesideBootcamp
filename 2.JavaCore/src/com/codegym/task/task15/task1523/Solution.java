package com.codegym.task.task15.task1523;

/* 
Overloading constructors

*/

public class Solution {

    private  int a;
    private String b;
    public Solution() {
    }

    protected Solution(int a) {
        this.a = a;
    }

    private Solution(String b) {
        this.b = b;
    }

    Solution(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

    }
}

