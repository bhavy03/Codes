package com.bhavya;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 6, 9, 87, 3, 5, 2};
        int target = 5;
        System.out.println(linearsearch(arr, target, 2, 4));
        //or
        System.out.println(linearsearch(new int[]{2, 4, 523, 5, 6, 32, 9, 3, 2}, 6, 2, 4));
    }

    static int linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
