package com.bhavya;

public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 66, 49, 36};
        System.out.println(maxRange(arr, 1, 4));
    }

    // work on edge cases here , like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }


        int maxval = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
