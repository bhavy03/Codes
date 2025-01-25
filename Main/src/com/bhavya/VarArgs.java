package com.bhavya;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //method which takes a variable no. of arguments is varargs or when we don't know many inputs we are giving
        fun(2, 34, 3, 4, 31, 3, 13, 4, 34, 234, 13, 1, 4424, 4);
        multiple(3673, 324526, "kunal", "bhavya", "asdkjfaksd");
        demo(2, 3, 4, 3); // if input is string then it will run second demo
    }

    static void multiple(int a, int b, String... v)/*here we can't use the varargs in between as they don't know when to end */ {
        System.out.println(Arrays.toString(v));
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
