package com.bhavya.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 5, 11};
        int target = 14;
        int n = arr.length;
        System.out.println(bruteForce(arr, target));
        System.out.println(twoSum(n, arr, target));
        System.out.println(Arrays.toString(sumHashing(arr, target)));
    }

    public static String bruteForce(int[] arr, int sum) {
//        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return "Yes";
//                    ans[0] = i;
//                    ans[1] = j;
                }
            }
        }
        return "NO";
    }

    //  now we do it with hashing
    public static String[] sumHashing(int[] arr, int target) {
        String[] ans = new String[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = target - arr[i];
            map.put(arr[i], value);
            if (map.containsKey(value)) {
                ans[0] = "yes";
                ans[1] = "yes";
            }

        }
        return ans;
    }

    //  we can do with two pointers but the problem is we have to sort it first
//  It is also not effective for that in which we need the same element and
//  also the time complexity is O(N)+O(N*logN)
    public static String twoSum(int n, int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }
}
