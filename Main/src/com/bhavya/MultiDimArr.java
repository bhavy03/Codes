package com.bhavya;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArr {
    // it is an array of arrays
    //concept same as string arrays
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3];  // it is necessary to specify no of rows but not column as each array is an individual object and size if array changes
//        // or
//        int[][] arra = {
//                {1, 2, 3},     // 0th index
//                {4, 5},        // 1st index
//                {6, 7, 8, 9},  // 2nd index -> arra[2] = {6,7,8,9}  and arra[2][0] = {6}
//        };

        int[][] arr = new int[3][3];
//        its like [ [],[],[] ]
        System.out.println(arr.length);  // no of rows

        // input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length /*here it is used as col is less than the size of row*/ ; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length;/*here it is used as col is less than the size of row*/ col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // output

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

//        enhanced for loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}












