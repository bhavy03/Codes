package com.bhavya;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
//         create an array
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;  // if you make a change to the object via this reference variable same object will be changed
        //here the value of arr is changed as because by nums value of oo th index is changed to 99 so as value of object changes reference variable also changes
    }
}
