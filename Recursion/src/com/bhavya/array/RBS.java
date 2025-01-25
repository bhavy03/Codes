package com.bhavya.array;

public class RBS {
    public static void main(String[] args) {
//        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int[] arr = {5, 6, 1, 2, 8, 4, 9, 45, 2};
        System.out.println(search(arr, 2, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
//                array sorted 1 portion
                return search(arr, target, s, m - 1);
            } else {
//                2 portion
                return search(arr, target, m + 1, e);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
//            2 portion
            return search(arr, target, m + 1, e);
        }
//        1 portion
        return search(arr, target, s, m - 1);
    }
}
