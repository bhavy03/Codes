package com.bhavya;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(min(new int[]{12, 56, 96, 3, 5, 6, 2}));
    }

    // assume arr.lenght is not 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }
}
