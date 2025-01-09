package com.bhavya.basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[,\\s\"]", "");
        int i = 0;
        return helper(str, i);
    }

    public static boolean helper(String str, int i) {
        if (i >= str.length() / 2) {
            return true;
        }
        if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            return helper(str, i + 1);
        }
        return false;
    }
}
