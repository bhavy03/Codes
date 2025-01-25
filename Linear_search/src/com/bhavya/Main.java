package com.bhavya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 3, 6, 59, 565, 9, 6, 8, 6, 2,};
        int target = in.nextInt();// or 565;
        //System.out.println(linearsearch(arr, target));
        //System.out.println(linearsearch2(arr, target));
        System.out.println(linearsearch3(arr, target));
    }


    //search in the array: return the index if item found
    //otherwise if the item not found return -1

//    static int linearsearch(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        //run a for loop
//        for (int index = 0; index < arr.length; index++) {
//            //check for every element at every index if it is = target
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        //this line will execute if none of the return,statements above have executed
//        //hence the target not found
//        return -1;


//          //search the target and return the element
//    static int linearsearch2(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//        }
//
//        return -1;



    //search the target and return true or false
    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;

    }
}

