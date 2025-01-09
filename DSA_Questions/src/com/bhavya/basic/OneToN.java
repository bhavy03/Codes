package com.bhavya.basic;

import java.util.Arrays;
import java.util.Scanner;

public class OneToN {

//                        WITH LOOP

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        System.out.println(Arrays.toString(printNos(x)));
//    }
//
//    public static int[] printNos(int x) {
//        int[] arr = new int[x];
//        return helper(x, arr);
//    }
//
//    public static int[] helper(int x, int[] arr) {
//        for (int i = 1; i <= x; i++) {
////            1 to N
//            arr[i - 1] = i;
////            N to 1
////            arr[x-i] = i;
//        }
//        return arr;
//    }

//                        WITHOUT LOOP

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        List<Integer> result = generateArray(n);
//        System.out.println(result);
//    }
//
//    public static List<Integer> generateArray(int n) {
//        List<Integer> array = new ArrayList<>();
//        generateArrayHelper(array, 1, n);
//        return array;
//    }
//
//    public static void generateArrayHelper(List<Integer> array, int start, int n) {
//        if (start <= n) {
//            array.add(start);
//            generateArrayHelper(array, start + 1, n);
//        }
//    }
}

