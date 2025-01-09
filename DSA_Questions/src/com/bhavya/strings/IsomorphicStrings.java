package com.bhavya.strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),t.charAt(i));
        }
        System.out.println(map);
        return true;
    }
}
