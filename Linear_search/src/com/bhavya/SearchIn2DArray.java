package com.bhavya;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {45, 23, 65},
                {2, 3, 6, 5, 8},
                {12, 54, 658},
                {254, 369, 9874, 36}
        };
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column}; //here it is initialized but not declared so it forms a new object
                }
            }
        }
        return new int[]{-1, -1};
    }
}
