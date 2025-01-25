package com.bhavya;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {45, 23, 65},
                {2, 3, 6, 5, 8},
                {12, 54, 658},
                {254, 369, 9874, 36}
        };
        System.out.println(Integer.MIN_VALUE);
        System.out.println(max(arr));
    }

//    static int max(int[][] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column < arr[row].length; column++) {
//                if (arr[row][column] > max) {
//                    max = arr[row][column];
//                }
//            }
//        }
//        return max;
//    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
