package com.codegym.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* 
Compare modifiers

*/

public class Solution {
    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        return (allModifiers & specificModifier) !=0;
    }


    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods) {

            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
