package com.bhavya.basic;

public class Countdigits {
    public static void main(String[] args) {
        System.out.println(counts(660));
    }

    public static int counts(int n) {
        int count = 0;
        int temp3 = n;
        return helper(n, count, temp3);
    }

    public static int helper(int n, int count, int temp3) {
        if (temp3 == 0) {
            return count;
        }
        int temp = temp3 % 10;
        int temp2 = temp3 / 10;
        if (temp == 0) {
            return helper(n, count, temp2);
        }
        if (n % temp == 0) {
            return helper(n, count + 1, temp2);
        }
        return helper(n, count, temp2);
    }
}
