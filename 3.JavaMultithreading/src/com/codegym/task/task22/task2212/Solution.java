package com.codegym.task.task22.task2212;

/* 
Phone number verification

*/

public class Solution {
    public static boolean checkPhoneNumber(String phoneNumber) {
        boolean flag = true;
    if (phoneNumber == null)
          return false;
/*
      if (!((phoneNumber.matches(".*\\([\\d]{3}\\)?.*") || (phoneNumber.matches("\\+[\\d]{12}")) || (phoneNumber.matches("\\+(\\d*\\([\\d]{3}\\))?[\\d*-]*\\d")) || (phoneNumber.matches("[\\d*-]*\\d")) || (phoneNumber.matches("((\\d*-){0,2})\\d*"))))) {
          flag = false;
      }
      if (phoneNumber.matches("^.{0,9}$")) {
          flag = false;
      }
      if (phoneNumber.matches("\\+(\\d*\\([\\d]{3}\\))?(\\d*-){3,}\\d"))
          flag = false;

      if (!phoneNumber.matches(".*[\\d]+$")) {
          flag = false;
      }
      if (phoneNumber.matches(".*[a-z,A-Z].*")) {
          flag = false;}
    return flag;
  }*/

        if (!((getLengthWithoutNonNum(phoneNumber) == 12) ||( getLengthWithoutNonNum(phoneNumber) == 10))) {
            flag = false;
        }
        if (!phoneNumber.matches(".*[\\d]+$")) {
            flag = false;
        }
        if (phoneNumber.matches(".*[a-z,A-Z].*")) {
            flag = false;
        }
        if ((getLengthWithoutNonNum(phoneNumber) == 12) && phoneNumber.startsWith("+")) {
            if ((!phoneNumber.matches("\\+\\d*(\\(\\d{3}\\))?((\\d+-){0,2})\\d*"))) {
                flag = false;
            }
        }
        if ((getLengthWithoutNonNum(phoneNumber) == 10) && (!phoneNumber.startsWith("+"))) {
            if (!phoneNumber.matches("\\d*(\\(\\d{3}\\))?((\\d+-){0,2})\\d*")) {
                flag = false;
            }

        }
        return flag;

    }


    public static void main(String[] args) {

        String[] sts = {
                "+380501234567",
                "+38(050)1234567",
                "+38050123-45-67",
                "050123-4567",
                "+38)050(1234567",
                "+38(050)1-23-45-6-7",
                "050xxx4567",
                "050123456",
                "(0)501234567"};

        for (String str : sts) {
           // System.out.println(getLengthWithoutNonNum(str));
             System.out.println(checkPhoneNumber(str));
            //System.out.println(str.matches(".*[\\d]+$"));
            //System.out.println(str.matches("\\+.{12,17}"));
            //System.out.println(str.matches("\\+.*\\([\\d]{3}\\)[-,1-9]*" ));
            //System.out.println(str.matches("\\+(\\d*\\([\\d]{3}\\))?[\\d*-]*\\d" )); //+48(432)45-4455-6
            //System.out.println(str.matches("^\\+\\d{12}$")); //+48(432)45-4455-6
            //System.out.println(!str.matches(".*[a-z,A-Z].*")); //no letter'

            //System.out.println(str.matches(".*[\\d]+$"));
            // System.out.println(str.matches("\\+[\\d]{12}"));
            // System.out.println(str.matches(".*\\([\\d]{3}\\)?.*" ));
//( phoneNumber.matches("[\\d]{10}"))) /* ||
            // System.out.println(str.matches("((\\d*-){0,2})\\d*"));
            ;//last digit
            ;


        }
    }

    public static int getLengthWithoutNonNum(String phoneNumber) {
        return phoneNumber.replaceAll("\\D", "").length();
    }
}
