package com.bhavya.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeaderArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.println(leader(arr));
        System.out.println(arrayLeader(arr));
        ArrayList<Integer> ans= arrayLeader(arr);
        Collections.sort(ans, Collections.reverseOrder());
        System.out.println(ans);
//        System.out.println(Arrays.toString(ans));
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.print(ans.get(i)+" ");
//        }
    }

    public static ArrayList<Integer> leader(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader) list.add(arr[i]);

        }
        return list;
    }

    public static ArrayList<Integer> arrayLeader(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> leader = new ArrayList<>();
        int last = arr[n - 1];
        leader.add(arr[n-1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > last) {
                leader.add(arr[i]);
                last = arr[i];
            }
        }
        return leader;
    }
}
