package com.bhavya.Questions;

import static com.bhavya.Questions.Question1.swap;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {4,3,3,2,1};    //can't work with discontinuous numbers
        System.out.println( Findduplicate(arr));
    }

    public static int Findduplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] -1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
