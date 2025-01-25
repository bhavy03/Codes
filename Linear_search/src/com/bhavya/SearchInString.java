package com.bhavya;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Bhavya";
        char target = 'v';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target) {
        if (str.length()/*here the brakets as because here it is function not variable inside it is a variable but not here*/ == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i))
                return true;
        }
        return false;
    }

    //to use for each loop we need to convert to an array
    static boolean search2(String str, char target) {
        if (str.length()/*here the brakets as because here it is function not variable inside it is a variable but not here*/ == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (str.length() == target)
                return true;
        }
        return false;
    }
}
