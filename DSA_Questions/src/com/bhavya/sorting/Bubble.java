package com.bhavya.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }


    static void bubbleSort(int[] arr, int n) {
        boolean swapped;
//        run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
//            for each step max item will come at the last respective index
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
//                    swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
//                swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you don't swap for a particular value of i,it means the array is sorted hence stop the program
            if (!swapped) {  // !swapped = true
                break;
            }
        }
    }
}
