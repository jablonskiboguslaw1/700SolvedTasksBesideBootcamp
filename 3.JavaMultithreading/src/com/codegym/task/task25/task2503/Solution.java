package com.codegym.task.task25.task2503;

/* 
Your own enum

*/

public class Solution {
    /**
     * Output:
     * <p/>
     * Available Amount
     * Account Number
     * Bank Name
     * --------------------
     * Available Amount
     * Bank Name
     */
    public static void main(String[] args) {

        Column.configureColumns(Column.Amount, Column.AccountNumber, Column.Customer);
       // Column.configureColumns(Column.AccountNumber,Column.Customer, Column.BankName);

        for (Columnable columnable : Column.getVisibleColumns()) {
            System.out.println(columnable.getColumnName());
        }

        System.out.println("--------------------");
        Column.Customer.hide();


        for (Columnable columnable : Column.getVisibleColumns()) {
            System.out.println(columnable.getColumnName());
        }
    }
}
