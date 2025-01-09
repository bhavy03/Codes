package com.bhavya.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(Arrays.toString(sorted(arr)));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 1, 2, 0, 1));
        int n = 6;
        sortArray(list, n);
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }

    public static int[] sorted(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            if (arr[i] == 1) {
                count1++;
            }
            if (arr[i] == 2) {
                count2++;
            }
        }
        helper(arr, 0, count0, 0);
        helper(arr, count0, count0 + count1, 1);
        helper(arr, count0 + count1, n, 2);
        return arr;
    }

    public static void helper(int[] arr, int start, int end, int value) {
        for (int i = start; i < end; i++) {
            arr[i] = value;
        }
    }

    //  Now by using Dutch National flag algorithm
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }

}
