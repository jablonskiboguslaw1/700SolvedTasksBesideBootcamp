package com.codegym.task.task24.task2401;

import java.lang.reflect.Method;

public class Util {
    // Approximately how a marker interface is used
    // This method is available only for a SelfMarkerInterface implementation
    public static void testClass(SelfMarkerInterface markerInterface) throws UnsupportedMarkerInterfaceException {
        if (markerInterface != null){
        for (Method method : markerInterface.getClass().getDeclaredMethods()) {
            System.out.println(method);}

        }else throw new UnsupportedMarkerInterfaceException();
    }
}
