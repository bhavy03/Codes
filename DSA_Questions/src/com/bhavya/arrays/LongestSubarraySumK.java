package com.bhavya.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        long k = 6;
        System.out.println(bruteForce(a, k));
        System.out.println(bruteForce2(a, k));
        System.out.println(getLongestSubarrayUsingHashing(a, k));
        System.out.println(getLongestSubarray(a, k));
    }

    //   It is the brute force approach with three for loops that checks the sum with all possible sub-arrays.
//   It has time complexity as O(N^3) and space complexity as O(1)
    public static int bruteForce(int[] a, long k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            for (int j = i; j < n; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    //   It the that brute force that uses only two for loops
//   It has time complexity as O(N^2) and space complexity as O(1)
    public static int bruteForce2(int[] a, long k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            long s = 0; // Sum variable
            for (int j = i; j < n; j++) { // ending index
                // add the current element to
                // the subarray a[i...j-1]:
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    //   Now we use hashing for this
//   Time Complexity: O(N) or O(N*logN) depending on which map data structure we are using, where N = size of the array.
//   Reason: For example, if we are using an unordered_map data structure in C++ the time complexity will be O(N)(though in the worst case,
//   unordered_map takes O(N) to find an element and the time complexity becomes O(N2)) but if we are using a map data structure,
//   the time complexity will be O(N*logN). The least complexity will be O(N) as we are using a loop to traverse the array.
//   Space Complexity: O(N) as we are using a map data structure.
//   Now it is the optimized solution for both + and - numbers while the next one which is greedy+two Pointer is optimized for only +
    public static int getLongestSubarrayUsingHashing(int[] a, long k) {
        int n = a.length; // size of the array.

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];
            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;
            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }


    //   Now we do it with 2 pointers
//   Time Complexity: O(2*N), where N = size of the given array.
//   Reason: The outer while loop i.e. the right pointer can move up to index n-1(the last index).
//   Now, the inner while loop i.e. the left pointer can move up to the right pointer at most.
//   So, every time the inner loop does not run for n times rather it can run for n times in total.
//   So, the time complexity will be O(2*N) instead of O(N2).
//   Space Complexity: O(1) as we are not using any extra space.
    public static int getLongestSubarray(int[] a, long k) {
        int n = a.length; // size of the array.
        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            // we use while to make sum less or equal to k as not if as it run only once
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
}
