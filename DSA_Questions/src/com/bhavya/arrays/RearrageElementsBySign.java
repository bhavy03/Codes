package com.bhavya.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RearrageElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = RearrangebySign(A);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static int[] rearrangeArray(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                list1.add(arr[i]);
            }else{
                list2.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
//            arr[2*i] = list1.get(i);
//            arr[2*i+1] = list2.get(i);
//            for this make arr.length/2
            if(i%2 == 0){
                arr[i] = list1.get(count1);
                count1++;
            }else{
                arr[i] = list2.get(count2);
                count2++;
            }
        }
        return arr;
    }

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n = A.size();

        // Define array for storing the ans separately.
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            if (A.get(i) < 0) {
                ans.set(negIndex, A.get(i));
                negIndex += 2;
            }
            // Fill positive elements in even indices and inc by 2.
            else {
                ans.set(posIndex, A.get(i));
                posIndex += 2;
            }
        }

        return ans;
    }

}
