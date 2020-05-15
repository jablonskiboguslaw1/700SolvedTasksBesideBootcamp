package com.codegym.task.task19.task1904;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\codegym\\CodeGymTasks\\2.JavaCore\\src\\com\\codegym\\task\\task19\\task1904\\persons.txt"));
        PersonScannerAdapter ad = new PersonScannerAdapter(scanner);
        System.out.println(ad.read());
        System.out.println(ad.read());
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner personScanner) throws FileNotFoundException {

            this.fileScanner = personScanner;
        }

        @Override
        public Person read() throws IOException {
            Date date = null;
            String[] data = fileScanner.nextLine().split(" ");
            // Data birthday =DateTimeFormatter.ofPattern("MM dd YYYY").
            try {
                DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
                date = dateFormat.parse(data[3] + data[4] + data[5]);
            } catch (ParseException e) {
                // ... handle parsing exception
            }
            return new Person(data[2], data[0], data[1], date);

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}

