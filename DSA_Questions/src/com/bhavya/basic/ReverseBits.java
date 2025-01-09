package com.bhavya.basic;

import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        reverseBits(n,in);
    }
    public static void reverseBits(long n, Scanner in) {
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        for (int i = 0; i < n; i++) {
            String binaryString = toUnsignedBinaryString(arr[i]);
            System.out.println(Long.parseLong(binaryString, 2));
        }
    }
    public static String toUnsignedBinaryString(long decimal) {
        StringBuilder binaryString = new StringBuilder(32);
        for (int i = 31; i >= 0; i--) {
            long bit = (decimal >> i) & 1;
            binaryString.append(bit);
        }
        return binaryString.reverse().toString();
    }
}
