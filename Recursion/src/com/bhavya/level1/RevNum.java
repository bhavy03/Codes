package com.bhavya.level1;

public class RevNum {
    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }


    static int rev2(int n) {
//        sometimes you might need to add additional variables in the argument
//        in that case make another function
        int noOfDigits = (int) (Math.log10(n)) + 1;
        return helper(n, noOfDigits);
    }

    static int helper(int n, int noOfDigits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, noOfDigits - 1)) + helper(n / 10, noOfDigits - 1);
    }


    static boolean palind(int n) {
        return (n == rev2(n));
    }

    public static void main(String[] args) {
        rev1(6246);
        System.out.println(sum);
        System.out.println(rev2(1234));
        System.out.println(palind(-1));
    }
}
