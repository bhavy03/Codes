package com.bhavya;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        /*
      syntax of if statement:
      if ( boolean expression T or F ) {
      // code
      }
      else { // do this}
      */

        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
//        if (salary > 10000) {
//            System.out.println(salary = salary + 2000);
//        } else {
//            System.out.println(salary = salary + 1000);
//        }


//        multiple if else
        if (salary < 10000) {
            salary += 2000;  /*salary = salary + 2000*/
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
