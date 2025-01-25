package com.bhavya;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        // we can't take char as input but we take string as input so we convert string to char
        // here trim removes all the spaces after and before the last letter of words
        // and charAt(0) means char at 0 th index

//        String word = "hello";
//        System.out.println(word.charAt(0));

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}

