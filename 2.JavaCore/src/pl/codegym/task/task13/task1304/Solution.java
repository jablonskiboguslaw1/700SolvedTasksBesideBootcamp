package pl.codegym.task.task13.task1304;

/* 
Selectable i Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //tutaj wpisz swój kod

public static class Screen implements  Selectable,Updatable{
    @Override
    public void onSelect() {

    }

    @Override
    public void refresh() {

    }
}
}
