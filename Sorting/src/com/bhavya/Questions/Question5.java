package com.bhavya.Questions;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(Arrays.toString(mismatch(arr)));
    }
    public static int[] mismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
            }
        }
        //case 2
        return new int[]{-1, -1};
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
