package com.bhavya.level1;

public class Recursion {

    //    had to print from 1 to 5
    public static void main(String[] args) {
        print1(1);

//        recursive method
        print0(1);

    }

    public static void print0(int n) {
//      base condition
//      with no base condition function will keep calling itself and at some time the memory of computer gets filled and stack overflow error occurs
        if (n == 5) {
            System.out.println("5");
            return;
        }
        System.out.println(n);

//      this is called tail recursion
//      this is the last function call
        print0(n + 1);

//      recursive call
//      if you call a function again and again , you treat it as a separate call in stack
    }

    public static void print1(int n) {
        System.out.println("1");
        print2(2);
    }

    public static void print2(int n) {
        System.out.println("2");
        print3(3);
    }

    public static void print3(int n) {
        System.out.println("3");
        print4(4);
    }

    public static void print4(int n) {
        System.out.println("4");
        print5(5);
    }

    public static void print5(int n) {
        System.out.println("5");
    }
}

// recursion is function that calls itself
// why recursion
// recursion helps in solving complex problems easily
// first convert complex solution with recursive approach then convert it to iterative way to get optimized solution
// space complexity is not constant due to function calls