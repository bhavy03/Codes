package com.bhavya.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1};
        System.out.println(longestConsecutive(arr));
        System.out.println(longestSuccessiveElements(arr));
        System.out.println(longestSuccessiveElementsSorting(arr));
        System.out.println(longestSuccessiveElementshashing(arr));

    }

    //    this doesn't pass all test cases
    public static int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if (arr.length == 0) return 0;
        int j = 0;
        int count = 1;
        int maxcount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[j] == 1 || arr[i] - arr[j] == 0) {
                count++;
            } else {
                count = 1;
            }
            j++;
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }

    //    now here is the brute force method
//    here we know it is in n2 complexity
    public static int longestSuccessiveElements(int[] a) {
        int n = a.length; //size of array
        int longest = 1;
        //pick a element and search for its
        //consecutive numbers:
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int cnt = 1;
            //search for consecutive numbers
            //using linear search:
            while (linearSearch(a, x + 1) == true) {
                x += 1;
                cnt += 1;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static boolean linearSearch(int[] a, int num) {
        int n = a.length; //size of array
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }

    //    now we use better approach in which we do sorting
//   in this we check if a number is part of a sequence by checking if subtracting with 1 (gives) last-smaller
//   Time Complexity: O(NlogN) + O(N), N = size of the given array.
//   Reason: O(NlogN) for sorting the array. To find the longest sequence, we are using a loop that results in O(N).
//   Space Complexity: O(1), as we are not using any extra space to solve this problem.
    public static int longestSuccessiveElementsSorting(int[] a) {
        int n = a.length;
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    //    now it is the optimal approach in which we use set
//    in this at first if a value in set contains a value less than 1
//    if so then go for other numbers checking if not then don't

//    Time Complexity: O(N) + O(2*N) ~ O(3*N), where N = size of the array.
//    Reason: O(N) for putting all the elements into the set data structure.
//    After that for every starting element, we are finding the consecutive elements.
//    Though we are using nested loops, the set will be traversed at most twice in the worst case.
//    So, the time complexity is O(2*N) instead of O(N2).
//    Space Complexity: O(N), as we are using the set data structure to solve this problem.

    //    Note: The time complexity is computed under the assumption that we are using unordered_set and it is taking O(1) for the set operations.
//    If we consider the worst case the set operations will take O(N) in that case and the total time complexity will be approximately O(N2).
//    And if we use the set instead of unordered_set, the time complexity for the set operations will be O(logN) and the total time complexity will be O(NlogN).
    public static int longestSuccessiveElementshashing(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
