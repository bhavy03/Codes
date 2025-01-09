package com.bhavya.basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        double c[] = new double[2];
//        if (b == 1) {
//            for (int i = 0; i < b; i++) {
//                c[i] = in.nextDouble();
//            }
//        } else {
//            for (int i = 0; i < 2; i++) {
//                c[i] = in.nextDouble();
//            }
//        }
        for (int i = 0; i < b; i++) {
            c[i] = in.nextDouble();
        }
        System.out.println(areaSwitchCase(b, c));
    }

    public static double areaSwitchCase(int ch, double[] a) {
        switch (ch) {
            case 1:
                return Math.PI * a[0] * a[0];
            case 2:
                return a[0] * a[1];
            default:
                return 0;
        }
    }
}
