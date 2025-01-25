package com.bhavya.level1;

public class Fibonnaci {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);

        System.out.println(fiboFormula(50));
//        for (int i = 0; i < 10; i++) {
//            System.out.println(fiboFormula(i));
//        }
    }

    static long fiboFormula(long n) {
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
//        or
//        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));

    }


    public static int fibo(int n) {
//        base condition
        if (n < 2) {
            return n;
        }

//      this is not tail recursion as first it call fibo n-1 and then fibo n-2 and their addition is the return statement
        return fibo(n - 1) + fibo(n - 2);
    }
}
