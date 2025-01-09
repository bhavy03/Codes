package com.bhavya.basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(checkArmstrong(n));
    }

    public static boolean checkArmstrong(int n) {
        return (n == helper(n));
    }

    public static int helper(int n) {
        int noOfDigits = (int) (Math.log10(n)) + 1;
        return arms(n, noOfDigits);
    }


    public static int arms(int n, int noOfDigits) {
        if (n == 0) {
            return n;
        }
        int temp = n % 10;
        int temp2 = (int) Math.pow(temp, noOfDigits);
        return temp2 + arms(n / 10, noOfDigits);
    }
}
