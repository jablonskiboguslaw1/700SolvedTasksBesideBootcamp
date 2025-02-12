package pl.codegym.task.task05.task0521;

/* 
Wywoływanie konstruktora z konstruktora
*/

public class Kolo {

    public double x;
    public double y;
    public double promien;

    public double getPromien() {
        return promien;
    }

    public Kolo(double x, double y, double promien) {
        this.x = x;
        this.y = y;
        this.promien = promien;
    }

    public Kolo(double x, double y) {
        this(x,y,10.0);

    }

    public Kolo() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Kolo kolo = new Kolo();
        System.out.println(kolo.x + " " + kolo.y + " " + kolo.promien);
        Kolo inneKolo = new Kolo(10, 5);
        System.out.println(inneKolo.x + " " + inneKolo.y + " " + inneKolo.promien);
    }
}
