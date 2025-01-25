package com.bhavya.questions;

import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (1 <= n && n <= 100) {
            if (n % 2 == 0) {
                if (n >= 2 && n <= 5) {
                    System.out.println("Not Wierd");
                } else if (n >= 6 && n <= 20) {
                    System.out.println("Wierd");
                } else {
                    System.out.println("Not Wierd");
                }
            } else {
                System.out.println("Wierd");
            }
        }
    }
}

