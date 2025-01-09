package com.bhavya.basic;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 1; i <= num; i++) {
            if (i != 1 && i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
