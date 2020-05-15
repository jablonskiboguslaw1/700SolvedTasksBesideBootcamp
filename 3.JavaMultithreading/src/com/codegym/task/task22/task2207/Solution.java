package com.codegym.task.task22.task2207;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Inverted words

*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
      // String filename = "C:\\Users\\Bogus\\Desktop\\text.txt";
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(filename));
        String[] buffer;
        StringBuilder longString = new StringBuilder();
        while (reader1.ready()) {

            longString.append(reader1.readLine());
            longString.append(" ");
        }
        buffer = longString.toString().split(" ");

        StringBuilder builder = new StringBuilder();
        Pair mirror = null;
        for (int i = 0; i < buffer.length - 1; i++) {
            for (int j = i + 1; j < buffer.length ; j++) {

                if (builder.append(buffer[i]).reverse().toString().equals(buffer[j])) {
                    builder = new StringBuilder();
                    mirror = new Pair();
                    mirror.second = buffer[j];
                    mirror.first = buffer[i];
                    buffer[i]=null;
                    buffer[j]=null;

                    result.add(mirror);

                } else builder = new StringBuilder();
            }
        }

        for (
                Pair c : result) {
            System.out.print(c.first + " ");
            System.out.println(c.second);
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;
        }
    }

}