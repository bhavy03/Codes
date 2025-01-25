package com.bhavya.basic;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[] arr = {-18, -6, -1, 0, 3, 6, 12, 36, 56, 88, 97};
        //int target = 12;
        //System.out.println(arr,target);
        System.out.println(binarysearch(new int[]{-18, -6, -1, 0, 3, 6, 12, 36, 56, 88, 97}, 32));
    }

    //return the index
    //return -1 if it doesn't exist
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end /2)  we don't use this as it might be possible that(start + end)
            //exceeds the range of integer in java so we use better method of representation
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
        return -1;
    }

}
