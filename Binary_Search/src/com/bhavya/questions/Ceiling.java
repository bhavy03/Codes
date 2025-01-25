package com.bhavya.questions;

import java.util.Scanner;

public class Ceiling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = 32;
        System.out.println(ceiling(new int[]{-18, -6, -1, 0, 3, 6, 12, 36, 56, 88, 97}, target));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // but what if the target is greater than the greatest number in array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return start;
    }

}

