package com.bhavya.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];
        while (s <= e) {

//            also a reason why, if its sorted it will not swap
//            these two while loops helps in bringing the pivot to its place
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

//        now pivot is at right index,sort the two halves
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
