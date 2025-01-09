package com.bhavya.basic;

import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumOfAllDivisors(n));
    }

    static int sum2 = 0;

    public static int sumOfAllDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            int sum1 = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum1 = sum1 + j;
                }
            }
            sum2 = sum2+sum1;
        }
        return sum2;
    }
}
