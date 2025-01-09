package com.bhavya.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AppearsOnce {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2, 2};
        System.out.println((onlyOnce(arr)));
        System.out.println((getSingleElement(arr)));
        System.out.println((byXor(arr)));
        System.out.println(gettheSingleElement(arr));
    }

    public static int onlyOnce(int[] arr) {
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                list.removeAll(Collections.singleton(arr[i]));
            } else {
                list.add(arr[i]);
            }
        }
        return list.get(0);
    }

    public static int getSingleElement(int[] arr) {
        // Size of the array:
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;    
            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }
            // if the occurrence is 1 return ans:
            if (cnt == 1) return num;
        }
        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static int byXor(int[] arr) {
        //size of the array:
        int n = arr.length;
        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    //   can also do it by hashing
    public static int gettheSingleElement(int[] arr) {
        //size of the array:
        int n = arr.length;

        // Find the maximum element:
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //Find the single element and return the answer:
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
}
