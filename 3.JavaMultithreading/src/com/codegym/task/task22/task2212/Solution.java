package com.codegym.task.task22.task2212;

/* 
Phone number verification

*/
public class Solution {
    public static boolean checkPhoneNumber(String phoneNumber) {
        boolean flag = false;
        if(phoneNumber.matches("^\\+[\\d]{12}$"))
            flag=true;
      //  if (phoneNumber.matches("^\\+\\d\\d\\([\\d]{3}\\)"))


        return flag;
    }

    public static void main(String[] args) {
        System.out.println(checkPhoneNumber("+380501(234)567"));
      //  System.out.println(checkPhoneNumber("+38(050)1234567 "));

    }
}
