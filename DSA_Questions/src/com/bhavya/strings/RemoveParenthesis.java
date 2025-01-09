package com.bhavya.strings;

public class RemoveParenthesis {
    public static void main(String[] args) {
        String str = "(()())(())";
        removeParen(str);
    }

    public static void removeParen(String str) {
        int balance = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                // Only add '(' if it's not the outermost
                if (balance > 0) {
                    result.append(ch);
                }
                balance++;
            } else if (ch == ')') {
                balance--;
                // Only add ')' if it's not the outermost
                if (balance > 0) {
                    result.append(ch);
                }
            }
        }
        System.out.println(result);
    }
}
