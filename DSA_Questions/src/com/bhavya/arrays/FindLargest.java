package com.bhavya.arrays;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(largestElement(arr, n));
    }

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

//    static int sort(int arr[]) {
//        Arrays.sort(arr);
//        return arr[arr.length - 1];
//    }
}
