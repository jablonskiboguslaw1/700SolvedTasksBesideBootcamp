package com.codegym.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Deserialization

*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        A a;
        try {
            a = (A) objectStream.readObject();
            if (a instanceof A)
                return a;
        } catch (Exception e) {

            return null;
        }
        return a;
    }

    public class A implements Serializable {
    }


    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
