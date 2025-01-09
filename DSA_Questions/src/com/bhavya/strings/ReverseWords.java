package com.bhavya.strings;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
        reverseStack(s);
        System.out.println(result(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder ans = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i != 0) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }

    //    here we are doing with stack
//    first put the word into another word and if space captured then put the word in stack
//    and empty the string
//    Time Complexity: O(N), Traversing the entire string
//    Space Complexity: O(N), Stack and ans variable
    public static void reverseStack(String s) {
//        System.out.println(s);
        s += " ";
        Stack<String> st = new Stack<>();
        int i;
        String str = "";
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                st.push(str);
                str = "";
            } else {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1) {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek(); // The last word should'nt have a space after it
        System.out.println("After reversing words: ");
        System.out.print(ans);
    }

    //    here is more optimized solution
//    Time Complexity: O(N), N~length of string
//    Space Complexity: O(1), Constant Space
    public static String result(String s) {
        int left = 0;
        int right = s.length() - 1;
        String temp = "";
        String ans = "";
        //Iterate the string and keep on adding to form a word
        //If empty space is encountered then add the current word to the result
        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp += ch;
            } else if (ch == ' ') {
                if (!ans.equals("")) {
                    ans = temp + " " + ans;
                } else {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }
        //If not empty string then add to the result(Last word is added)
        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }
        return ans;
    }
}
