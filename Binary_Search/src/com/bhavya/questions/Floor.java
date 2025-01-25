package com.bhavya.questions;

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = 32;
        System.out.println(floor(new int[]{-18, -6, -1, 0, 3, 6, 12, 36, 56, 88, 97}, target));
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }

}

