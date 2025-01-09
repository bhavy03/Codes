package com.bhavya.arrays;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = 5;
        System.out.println(Arrays.toString(rotate(arr, k)));
        Rotateeletoright(arr, n, k);
        System.out.println("After Rotating the k elements to right ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int[] rotate(int[] arr, int k) {
        int[] temp = new int[5];
        int i = 0;
        for (int j = k + 1; j < arr.length; j++) {
            temp[i] = arr[j];
            i++;
        }
        for (int m = 0; m < k + 1; m++) {
            temp[i] = arr[m];
            i++;
        }
        return temp;
    }

    // now the better approach is reversal algorithm i.e.
    //Reverse the last k elements of the array
    //Reverse the first n-k elements of the array.
    //Reverse the whole array.

    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void Rotateeletoright(int[] arr, int n, int k) {
        // Reverse first n-k elements
        Reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        Reverse(arr, n - k, n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
    }

//    can also be done using a temp array
//public static void Rotatetoright(int[] arr, int n, int k) {
//    if (n == 0)
//        return;
//    k = k % n;
//    if (k > n)
//        return;
//    int[] temp = new int[k];
//    for (int i = n - k; i < n; i++) {
//        temp[i - n + k] = arr[i];
//    }
//    for (int i = n - k - 1; i >= 0; i--) {
//        arr[i + k] = arr[i];
//    }
//    for (int i = 0; i < k; i++) {
//        arr[i] = temp[i];
//    }
//}
}

