package com.bhavya.basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        int b = 1;
//        int count = 2;
        int n = in.nextInt();

        for (int i = 2; i < n; i++) {
            int temp = b;
            b = b + a;
            a = temp;
//            count++;
        }
        System.out.println(b);
    }
}
