package com.bhavya.basic;

import java.util.Scanner;

public class User_io {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ok = in.next().trim().charAt(0);
        if (ok >= 'A' && ok <= 'Z') {
            System.out.println('1');
        } else if (ok >= 'a' && ok <= 'z') {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}

