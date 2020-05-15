package pl.codegym.task.task14.task1408;

/* 
Ferma drobiu
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        System.out.println(hen.getMonthlyEggCount());
        System.out.println(hen.getDescription());
        Hen hen2 = HenFactory.getHen(Continent.ASIA);
        System.out.println(hen2.getMonthlyEggCount());
        System.out.println(hen2.getDescription());
        Hen hen3 = HenFactory.getHen(Continent.EUROPE);
        System.out.println(hen3.getMonthlyEggCount());
        System.out.println(hen3.getDescription());
        Hen hen4 = HenFactory.getHen(Continent.NORTHAMERICA);
        System.out.println(hen4.getMonthlyEggCount());
        System.out.println(hen4.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            if (continent.equals(Continent.AFRICA)) {
                hen= new AfricanHen();}
            if (continent.equals(Continent.ASIA)) {
                hen= new AsianHen();}
            if (continent.equals(Continent.NORTHAMERICA)) {
                hen= new NorthAmericanHen();}
            if (continent.equals(Continent.EUROPE)) {
                hen= new EuropeanHen();}
            //tutaj wpisz swój kod
            return hen;

        }
    }
}
