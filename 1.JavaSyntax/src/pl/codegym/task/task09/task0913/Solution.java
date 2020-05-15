package pl.codegym.task.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Solution {
    public static void main(String[] args) throws Exception {
        try { //tutaj wpisz swój kod

            method1();

            //tutaj wpisz swój kod
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        }
    }
        public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
            int i = (int) (Math.random() * 4);
            if (i == 0)
                throw new NullPointerException();
            if (i == 1)
                throw new ArithmeticException();
            if (i == 2)
                throw new FileNotFoundException();
            if (i == 3)
                throw new URISyntaxException("", "");
        }
    }
