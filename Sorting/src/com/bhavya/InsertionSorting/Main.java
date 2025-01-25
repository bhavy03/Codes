package com.bhavya.InsertionSorting;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] arr = {5,4,6,9,5,8};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length-1/* or i<=arr.length-2*/; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}





