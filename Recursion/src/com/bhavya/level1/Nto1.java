package com.bhavya.level1;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
        System.out.println();
        funRev(5);
        System.out.println();
        funBoth(5);
        System.out.println();
        funn(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        fun(n - 1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.print(n);
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        funBoth(n - 1);
        System.out.print(n);
    }

    static void funn(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
//        fun(n--);
        funn(--n);
    }
}
