package pl.codegym.task.task04.task0433;


/* 
Zobaczyć dolary w przyszłości
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int a = 1;
        int b = 1;
while(b<=10) {
    while (a <= 10) {
        System.out.print("$");
        a++;
    }
    System.out.println();
    a=1;
    b++;
}}}