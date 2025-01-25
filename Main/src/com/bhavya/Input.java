package com.bhavya;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of objects

        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 978;
//        arr[2] = 6;
//        arr[3] = 698;
//        arr[4] = 78;
//        System.out.println(arr[3]);
//
//        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        } // this for loop is used for taking input
//
        System.out.println(Arrays.toString(arr));

//        for (int i = 0;i < arr.length;i++) {
//            System.out.println(arr[i] + " ");
//        } //this for loop is used for printing output


//        for (int j : arr) {    //for every element in the array print the element
//            System.out.println(j + " ");  //here num represents the elements of the array
//        }

        // System.out.println(arr[5]);  index out of bound error

        //array of objects
        String[] str = new String[4];  //it's containing the reference variables to the objects and the objects are stored anywhere in the heap memory
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));
    }
}
