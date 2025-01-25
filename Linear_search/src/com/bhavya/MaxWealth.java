package com.bhavya;

public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maximumwealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            //now we have sum of accounts of persoon
            //check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
//find the middle element
//target>mid;search in the right else search in left
//if the middle element  == target element it is ans