package com.bhavya.arrays;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 3, 0, 4};
        int n = 6;
        System.out.println(Arrays.toString(move(a, n)));
    }

    public static int[] move(int[] a, int n) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }

}
// or by brute force we create temporary array and add all zeroes in last
//ArrayList<Integer> temp = new ArrayList<>();
//copy non-zero elements
//from original -> temp array:
//        for (int i = 0; i < n; i++) {
//        if (a[i] != 0)
//        temp.add(a[i]);
//        }
//
//        // number of non-zero elements.
//        int nz = temp.size();
//
//        //copy elements from temp
//        //fill first nz fields of
//        //original array:
//        for (int i = 0; i < nz; i++) {
//        a[i] = temp.get(i);
//        }
//
//        //fill rest of the cells with 0:
//        for (int i = nz; i < n; i++) {
//        a[i] = 0;
//        }
//        return a;