package com.bhavya.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removed(arr));
//        int k = removeDuplicates(arr);
//        System.out.println("The array after removing duplicate elements is ");
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

    public static int removed(int[] arr) {
        int count = 0;
        List<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i]) {
                arrlist.add(arr[i]);
                count++;
            }
        }
        arrlist.add(arr[arr.length - 1]);
        count++;
        System.out.println(arrlist);
        return count;
    }

//  can also be done with hashset as hashset doesn't store duplicate values
    static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
//        System.out.println("this is hash set "+set);
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }

//  also can be done like this

//    static int removeDuplicates(int[] arr) {
//        int i = 0;
//        for (int j = 1; j < arr.length; j++) {
//            if (arr[i] != arr[j]) {
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//        return i + 1;
//    }
}
