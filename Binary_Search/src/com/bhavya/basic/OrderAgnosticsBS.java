package com.bhavya.basic;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = {-18, -6, -1, 0, 3, 6, 12, 36, 56, 88, 97};
        int target = 12;
        System.out.println(oabs(arr, target));
    }

    static int oabs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the number is sorted in ascending or descending
        boolean isAsc;
        isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
