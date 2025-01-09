package com.bhavya.basic;

import java.util.Scanner;

public class GCD {
    public static int calcGCD(int n, int m) {
        int ans = 1;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.print("The GCD of the two number is " + calcGCD(n, m));
    }

}

//optimal approach
//public class Main {
//    static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
//    public static void main(String args[]) {
//        int a = 4, b = 8;
//        int ans = gcd(a, b);
//        System.out.print("The GCD of the two numbers is "+ans);
//    }
//}
