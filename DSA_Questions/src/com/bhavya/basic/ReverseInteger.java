package com.bhavya.basic;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(reverse(x));
    }

    static int sum = 0;

    public static int reverse(int x) {
        if (x == 0) {
            return sum;
        }
        int temp = x % 10;
        sum = sum * 10 + temp;
        return reverse(x / 10);
    }
}
