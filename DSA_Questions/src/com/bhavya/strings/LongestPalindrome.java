package com.bhavya.strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "ababad";
        System.out.println(longestPalindrome(s));
    }


    public static String longestPalindrome(String s) {
        int left = s.length() / 2;
        int right = s.length() / 2 + 1;
        String longest = "";
//        System.out.println(right);
//        System.out.println(left);
        int maxlen = 0;
        while (left >= 0 && right < s.length()) {
            if (isPalindrome(s.substring(left, right + 1))) {
                maxlen = Math.max(maxlen, right - left + 1);
                longest = s.substring(left, right + 1);
                left--;
                right++;
            } else {
                left--;
            }
            if (left < 0) {
                left = s.length() / 2;
                right = s.length() / 2 + 1;
                while (right < s.length()) {
                    right++;
                    if (isPalindrome(s.substring(left, right + 1))) {
                        maxlen = Math.max(maxlen, right - left + 1);
                        left--;
                        right++;
                    } else {
                        right++;
                    }
                }
            }
        }
        System.out.println(maxlen);
        return "hello";
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}