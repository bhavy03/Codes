package com.bhavya.strings;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
//        System.out.println('n'-'a');
        System.out.println(isAnagram(s, t));
        System.out.println(anagramBuilder(s, t));
        System.out.println(checkAnagrams(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        if (arr1.length != arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < s.length(); i++) {
            if (arr1[i] == arr2[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean anagramBuilder(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        HashMap<Character, Integer> countMap = new HashMap<>();
        HashMap<Character, Integer> countMap1 = new HashMap<>();
        for (char num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (char num : arr2) {
            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
        }
        return countMap.equals(countMap1);
    }

    //    now here is the most optimized solution
//    in this we create alphabetic freq array and store the chars in it and then remove it and if it is zero then it is anagram.
    public static boolean checkAnagrams(String str1, String str2) {
        // when both of the strings have different lengths
        if (str1.length() != str2.length())
            return false;

        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
//            freq[str1.charAt(i) - 'a'] = freq[str1.charAt(i) - 'a'] + 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
}
