package com.bhavya;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 66, 49, 36};
        System.out.println(max(arr));
//        or
//        System.out.println(max(new int[] {2,4,3,4,1}));
    }

    //imagine that arr is not empty
    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }


        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
