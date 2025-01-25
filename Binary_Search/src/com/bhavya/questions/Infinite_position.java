package com.bhavya.questions;

public class Infinite_position {
    public static void main(String[] args) {
    }

    static int findRange(int[] arr,int target){
//        first find the range
//        first start with a box of size 2
        int start = 0;
        int end = 1;

//        con
    }
    static int binarysearch(int[] arr, int target, int start, int end) {

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
        return -1;
    }
}
