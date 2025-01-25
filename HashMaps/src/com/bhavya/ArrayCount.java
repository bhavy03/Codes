package com.bhavya;

import java.util.HashMap;

public class ArrayCount {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 6};
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print the elements and their counts
        for (HashMap.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
