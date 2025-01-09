package com.bhavya.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseREC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(reverseArray(n, arr)));
    }

    public static int[] reverseArray(int n, int[] nums) {
        int start = 0;
        int end = n - 1;
        return helper(nums, start, end);
    }

    public static int[] helper(int[] arr, int start, int end) {
        if (start > end) {
            return arr;
        }
        swap(arr, start, end);
        return helper(arr, start + 1, end - 1);
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
