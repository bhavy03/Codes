package com.bhavya;

import java.util.Scanner;

public class Loops_2 {
    public static void main(String[] args) {

//        for loops
//        (example print first ten numbers)

        /*
         syntax of for loops
         for(initialisation; condition; increment/decrement){ code }
         */

//        print numbers from 1 to 5
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }

        /*
        this int num = 1 happens only one time    //cpi
        then check then print then increase
        then check then print then increase
        then check then print then increase
        */

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
            System.out.println("hello world");
        }

//       while loops (keep taking input from the user until it presses x)

        /*
          syntax:
          while (condition){ code }
          */

          int num = 1;
          while(num <= 5){
              System.out.println(num);
              num = num + 1;
          }

    }
}



