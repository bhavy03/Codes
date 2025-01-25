package com.bhavya.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {
//    public static void main(String[] args) {
//        int[] arr = {1,2,4,3,8,3,2,7};
//        System.out.println(Arrays.toString(new List(arr)));
//    }
    public List<Integer> findalldupicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
