package com.bhavya.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int N = 6;
        int K = 4;
        System.out.println(searchInSorted(arr,N,K));
    }

    public static int searchInSorted(int[] arr, int N, int K) {
        for (int i = 0; i < N; i++) {
          if(arr[i] == K){
              return i;
          }
        }
        return -1;
    }
}
