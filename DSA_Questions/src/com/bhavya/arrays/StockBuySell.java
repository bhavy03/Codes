package com.bhavya.arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {2,4,1};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
        System.out.println(smallest(arr));
        System.out.println(maxProfited(arr));
    }

    public static int maxProfit(int[] arr) {
        int maxPro = 0;
//        int pro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
//                    pro = arr[j] - arr[i];
                }
//                if(pro > maxPro)
//                    maxPro = pro;
            }
        }
        return maxPro;
    }

    static int maxProfited(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }

// this will run for few cases only
    public static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        if(index == arr.length-1)
            return 0;
        for (int i = index+1; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max-min;
    }
}
