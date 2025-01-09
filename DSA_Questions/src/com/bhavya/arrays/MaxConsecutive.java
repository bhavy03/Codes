package com.bhavya.arrays;

public class MaxConsecutive {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(maxconsecutive(arr));
    }

    public static int maxconsecutive(int nums[]) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (cnt > maxi) {
                maxi = cnt;
            }
//            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
}
