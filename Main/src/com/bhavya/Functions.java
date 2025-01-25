package com.bhavya;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println("the ans is " + ans );

        Scanner in = new Scanner(System.in);
        //int ans = sum3(20,30);
        //System.out.println(ans);
        System.out.println(sum3(in.nextInt(), in.nextInt()));
    }


//        in java functions are in class therefore they are called as methods
//    after finishing the call (sum()) it has going to be of some value
//    and the value is the whatever we are going to return in this {System.out.println("the sum is " + sum);} function

    /*
         return_type name (arguments) {
         //body
         return statement;
         }
     */

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }


    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

//        after return nothing will execute
//        System.out.println("the sum is " + sum);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is " + sum);
    }
}
