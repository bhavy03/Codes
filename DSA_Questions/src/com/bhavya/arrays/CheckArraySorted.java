package com.bhavya.arrays;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {2,3,3,5,6};
        System.out.println(sorted(arr));
    }

    public static boolean sorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] < arr[i]){
                return false; // here return that which has to be run only one time so that loop goes on and doesn't stop.
            }
        }
        return true;
    }
}
