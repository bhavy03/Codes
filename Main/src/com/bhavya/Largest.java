package com.bhavya;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b && a > c) {
            System.out.println("The greatest number is " + a);
        } else if (b > c && b > a) {
            System.out.println("The greatest number is " + b);
        } else {
            System.out.println("The greatest number is " + c);
        }


//                              or

        int maxi = a;   //or take maxi 0
        if (b > maxi) {
            maxi = b;
        }
        if (c > maxi) {
            maxi = c;
        }
        System.out.println(maxi);

//                               or

//        int max = Math.max(c, Math.max(a, b));
        System.out.println(Math.max(47,384));

//                               or

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}