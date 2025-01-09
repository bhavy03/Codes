package com.bhavya.strings;

public class MaximumNestingDepthParen {
    public static void main(String[] args) {
        String s = "()(())((()()))";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int balance = 0;
        int maxcount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
            }
            if(balance > maxcount){
                maxcount = balance;
            }
            if (s.charAt(i) == ')') {
                balance--;
            }
        }
        return maxcount;
    }
}
