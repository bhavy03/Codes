package com.bhavya.basic;

import java.util.Scanner;

public class SUMofFirstN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(sumFirstN(n));
    }

    public static long sumFirstN(long n) {
        long sum = 0;
        return helper(n, sum);
    }

    public static long helper(long n, long sum) {
        if (n == 0) {
            return sum;
        }
        return helper(n - 1, sum + n);
    }
}
