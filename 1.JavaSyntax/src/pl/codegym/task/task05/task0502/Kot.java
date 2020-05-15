package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

public class Kot {

    public int wiek;
    public int waga;
    public int sila;

    public Kot() {
    }

    public Kot(int wiek, int waga, int sila) {
        this.wiek = wiek;
        this.waga = waga;
        this.sila = sila;
    }

    public int getWiek() {
        return wiek;
    }

    public int getWaga() {
        return waga;
    }

    public int getSila() {
        return sila;
    }

    public boolean walka(Kot innyKot) {
        if (this.wiek > innyKot.getWiek())
            return true;
        else if (this.wiek < innyKot.getWiek())
            return false;
        else if (this.waga > innyKot.getWaga())
            return true;
        else if (this.waga < innyKot.getWaga())
            return false;
        else if (this.sila > innyKot.getSila())
            return true;
        else if (this.sila < innyKot.getSila())
            return false;
        else return false;
        //tutaj wpisz swój kod

    }

    public static void main(String[] args) {
        Kot kot1 = new Kot(4, 5, 1);
        Kot kot2 = new Kot(5, 5, 2);
        Kot kot3 = new Kot(6, 1, 2);
        Kot kot4 = new Kot(6, 1, 2);


        System.out.println(kot2.walka(kot1));
        System.out.println(kot2.walka(kot1));
        System.out.println(kot3.walka(kot4));
        System.out.println(kot2.walka(kot4));
    }

}