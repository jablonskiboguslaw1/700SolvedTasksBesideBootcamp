package pl.codegym.task.task12.task1233;

/* 
Nadchodzą izomorfy
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum to " + result.x);
        System.out.println("Indeks najmniejszego elementu to " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int minimum = array[0];
        int minInd=0;
        for (int i = 1; i <array.length ; i++)
        if (minimum>array[i]){
        minimum=array[i];
        minInd = i;}



        //tutaj wpisz swój kod

        return new Pair<Integer, Integer>(minimum, minInd);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
