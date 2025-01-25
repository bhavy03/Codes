package com.bhavya;

public class Overloading {
    //    function loading occurs if 2 or more functions exist of same name but of different parameters whether return type is changed or not
//    function overloading  decides at the time of compilation which function to run
//    either the number of arguments be different or the type of arguments be different
    public static void main(String[] args) {
        fun(34);
        fun("Kunal");
        int ans = sum(3, 4);  //if we give a third number it will run second sum method
        System.out.println(ans);
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("second one");
        System.out.println(name);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
