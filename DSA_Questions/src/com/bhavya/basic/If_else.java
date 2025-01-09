package com.bhavya.basic;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(compareIfElse(in.nextInt(), in.nextInt()));
    }

    public static String compareIfElse(int a, int b) {
        if (a > b) {
            return "greater";
        } else if (a < b) {
            return "smaller";
        } else {
            return "equal";
        }

    }

}
