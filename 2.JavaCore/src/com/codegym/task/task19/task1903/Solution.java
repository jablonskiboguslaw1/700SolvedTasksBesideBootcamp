package com.codegym.task.task19.task1903;

/* 
Adapting multiple interfaces

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {


  }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String temp = String.valueOf(data.getPhoneNumber());
            StringBuilder builder = new StringBuilder();
            int phoneLength = temp.toCharArray().length;
            if ( phoneLength<10){
                for(int i =phoneLength; i<10;i++){
                builder.append("0");}}
            builder.append(temp);
            String length10phone = builder.toString();

            StringBuilder builder2 = new StringBuilder();
            builder2.append("+")
                    .append(data.getCountryPhoneCode())
                    .append("(")
                    .append(length10phone, 0, 3)
                    .append(")")
                    .append(length10phone,3,6)
                    .append("-")
                    .append(length10phone,6,8)
                    .append("-").append(length10phone.substring(8));






            return builder2.toString();
        }
    }


    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      // For example: 1

        int getPhoneNumber();           // For example: 991234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();        // For example: +1(099)123-45-67
    }
}