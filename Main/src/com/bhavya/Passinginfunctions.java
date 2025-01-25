package com.bhavya;

import java.util.Arrays;

public class Passinginfunctions {
    public static void main(String[] args) {
        int[] nums = {32, 4, 64, 24, 9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 33;
        //mutable behaviour ( means change the object)
        //strings are immutable in java while arrays are mutable in java
    }
}
