package pl.codegym.task.task13.task1316;

/* 
Niepoprawne linie
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Zatwierdź";


        String onPress(Object o);

    }
}