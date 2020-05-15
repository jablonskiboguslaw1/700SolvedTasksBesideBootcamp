package pl.codegym.task.task06.task0603;

/* 
Obiekty klasy Kot i Pies: w każdej po 50000
*/

public class Solution {
    public static void main(String[] args) {
       Kot kot;
       Pies pies;
        for (int i = 1;i<=50000;i++){
            kot = new Kot();
            pies = new Pies();// tutaj wpisz swój kod

    }
    }
}

class Kot {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Kot został zniszczony");
    }
}

class Pies {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Pies został zniszczony");
    }
}
