package com.bhavya.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityOccurMoreThanNBY2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(moreOccur(arr));
        System.out.println(majorityElementHashing(arr));
        System.out.println(majorityElement(arr));
    }

    public static int moreOccur(int[] arr) {
        int mid = arr.length / 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
//            by initializing count here i.e. int count = 0; we don't have to make count = 0 afterwards
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > mid) {
                return arr[i];
            } else {
                count = 0;
            }
        }
        return -1;
    }

    //  we can also do it with hashmap
//  Time Complexity: O(N*logN) + O(N), where N = size of the given array.
//  Reason: We are using a map data structure.
//  Insertion in the map takes logN time. And we are doing it for N elements.
//  So, it results in the first term O(N*logN). The second O(N) is for checking which element occurs more than floor(N/2) times.
//  If we use unordered_map instead, the first term will be O(N) for the best and average case
//  and for the worst case, it will be O(N2).
//  Space Complexity: O(N) as we are using a map data structure.
    public static int majorityElementHashing(int[] v) {
        //size of the given array:
        int n = v.length;
        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }
        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }


    //  can also be solved with Moore's voting algorithm
//    Time Complexity: O(N) + O(N), where N = size of the given array.
//    Reason: The first O(N) is to calculate the count and find the expected majority element.
//    The second one is to check if the expected element is the majority one or not.
//    Note: If the question states that the array must contain a majority element,
//    in that case, we do not need the second check. Then the time complexity will boil down to O(N).
//    Space Complexity: O(1) as we are not using any extra space.
    public static int majorityElement(int[] v) {
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }
}
