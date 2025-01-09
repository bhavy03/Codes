package com.bhavya.arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(arr)));
    }
    public static int[] rotate(int[] arr){
        int i = 0;
        int temp = arr[0];
        for (int j = 1; j < arr.length ; j++) {
            arr[i] = arr[j];
            i++;
        }
//        we can also print the elements into separate array
        arr[arr.length-1] = temp;
        return arr;
    }
}
